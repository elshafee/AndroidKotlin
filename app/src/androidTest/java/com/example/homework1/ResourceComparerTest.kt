package com.example.homework1

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

//step 1


//class ResourceComparerTest {
//    val resourceComparer = ResourceComparer()
//
//    @Test
//    fun stringResourceSameAsGivenString_returnsTrue(){
//        val context =ApplicationProvider.getApplicationContext<Context>()
//        val result = resourceComparer.isEqual(context,R.string.app_name,"Homework1")
//        assertThat(result).isTrue()
//    }
//
//    @Test
//    fun stringResourceDifferentAsGivenString_returnsFalse(){
//        val context =ApplicationProvider.getApplicationContext<Context>()
//        val result = resourceComparer.isEqual(context,R.string.app_name,"Homework")
//        assertThat(result).isFalse()
//    }
//
//}

//    Step 2


// class ResourceComparerTest {
//    private lateinit var  resourceComparer: ResourceComparer
//
//    @Test
//    fun stringResourceSameAsGivenString_returnsTrue(){
//        resourceComparer = ResourceComparer()
//        val context =ApplicationProvider.getApplicationContext<Context>()
//        val result = resourceComparer.isEqual(context,R.string.app_name,"Homework1")
//        assertThat(result).isTrue()
//    }
//
//    @Test
//    fun stringResourceDifferentAsGivenString_returnsFalse(){
//        resourceComparer = ResourceComparer()
//        val context =ApplicationProvider.getApplicationContext<Context>()
//        val result = resourceComparer.isEqual(context,R.string.app_name,"Homework")
//        assertThat(result).isFalse()
//    }
//
//}

//Step 3














 class ResourceComparerTest {
    private lateinit var  resourceComparer: ResourceComparer
    @Before
    fun setup(){
        resourceComparer = ResourceComparer()

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context =ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"Homework1")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context =ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"Homework")
        assertThat(result).isFalse()
    }

}

