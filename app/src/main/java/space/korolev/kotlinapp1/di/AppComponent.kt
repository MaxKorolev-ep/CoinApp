package space.korolev.kotlinapp1.di

import dagger.Component
import space.korolev.kotlinapp1.activities.MainActivity
import space.korolev.kotlinapp1.fragments.CurrenciesListFragment
import space.korolev.kotlinapp1.mvp.presenter.CurrenciesPresenter
import space.korolev.kotlinapp1.mvp.presenter.LatestChartPresenter
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, RestModule::class, MvpModule::class, ChartModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)
    fun inject(fragment: CurrenciesListFragment)
}