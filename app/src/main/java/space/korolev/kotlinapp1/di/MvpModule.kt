package space.korolev.kotlinapp1.di

import dagger.Module
import dagger.Provides
import space.korolev.kotlinapp1.mvp.presenter.CurrenciesPresenter
import space.korolev.kotlinapp1.mvp.presenter.LatestChartPresenter
import javax.inject.Singleton

@Module
class MvpModule {

    @Provides
    @Singleton
    fun provideCurrenciesPresenter(): CurrenciesPresenter = CurrenciesPresenter()

    @Provides
    @Singleton
    fun provideLatestChartPresenter(): LatestChartPresenter = LatestChartPresenter()
}