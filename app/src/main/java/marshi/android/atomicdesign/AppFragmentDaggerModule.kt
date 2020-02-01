package marshi.android.atomicdesign

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import marshi.android.atomicdesign.domain.PlusInterface

@Module
interface AppFragmentDaggerModule {

    @ContributesAndroidInjector(modules = [PlusModule::class])
    fun contributeAppFragment(): AppFragment
}

@Module
interface PlusModule {
    @Binds
    fun bindsPlus(plus: Plus): PlusInterface
}
