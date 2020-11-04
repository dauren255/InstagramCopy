package com.example.instagramcopy

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Post(val postAuthorUsername: String,
           val postAuthorPhoto: Int,
           val postImage: Int,
           val postLikes: Int,
           val postDescription: String,
           val commentCount: Int
): Parcelable {}