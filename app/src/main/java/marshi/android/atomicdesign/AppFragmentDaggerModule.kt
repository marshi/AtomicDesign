package marshi.android.atomicdesign

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AppFragmentDaggerModule {

    @ContributesAndroidInjector()
    fun contributeAppFragment(): AppFragment
}


