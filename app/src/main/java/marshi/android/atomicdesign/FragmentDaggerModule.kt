package marshi.android.atomicdesign

import dagger.Module
import marshi.android.atomicdesign.AppFragmentDaggerModule

@Module(
    includes = [AppFragmentDaggerModule::class]
)
interface FragmentDaggerModule
