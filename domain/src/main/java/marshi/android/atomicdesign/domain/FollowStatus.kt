package marshi.android.atomicdesign.domain

enum class FollowStatus(val id: Int) {
  FOLLOWING(0),
  NOT_FOLLOWING(1);

  companion object {
    fun from(id: Int): FollowStatus? {
      return values().firstOrNull { it.id == id }
    }
  }
}
