package marshi.android.atomicdesign.uicomponent

enum class FollowButtonState(val id: Int) {
  FOLLOW(0),
  UNFOLLOW(1);

  companion object {
    fun from(id: Int): FollowButtonState? {
      return values().firstOrNull { it.id == id }
    }
  }
}
