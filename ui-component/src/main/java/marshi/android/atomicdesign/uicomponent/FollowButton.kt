package marshi.android.atomicdesign.uicomponent

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.withStyledAttributes
import androidx.core.view.isGone
import androidx.core.view.isVisible
import marshi.android.atomicdesign.uicomponent.databinding.FollowButtonBinding

class FollowButton @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

  private val binding = FollowButtonBinding.inflate(LayoutInflater.from(context), this, true)
  private lateinit var status: FollowButtonState

  init {
    context.withStyledAttributes(
      attrs, R.styleable.FollowButton, defStyleAttr, 0
    ) {
      if (!isInEditMode) {
        status = FollowButtonState.from(
          getInteger(
            R.styleable.FollowButton_state,
            FollowButtonState.FOLLOW.id
          )
        ) ?: FollowButtonState.FOLLOW
        changeStatus(status)
      }
    }
  }

  fun changeStatus(status: FollowButtonState) {
    when (status) {
      FollowButtonState.FOLLOW -> {
        binding.followButton.isVisible = true
        binding.unfollowButton.isGone = true
      }
      FollowButtonState.UNFOLLOW -> {
        binding.followButton.isGone = true
        binding.unfollowButton.isVisible = true
      }
    }
  }
}
