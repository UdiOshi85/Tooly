package com.github.udioshi85.tooly

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

abstract class EndlessScrollListener(var currentPage: Int, val thresholdRemainingItemsBeforeLoading: Int = ALLOWED_REMAINING_ITEMS_BEFORE_LOADING): RecyclerView.OnScrollListener() {

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)

        val mLayoutManager: LinearLayoutManager = recyclerView.layoutManager as LinearLayoutManager
        val visibleItemCount = recyclerView.childCount
        val totalItemCount = mLayoutManager.itemCount

        val firstVisibleItemPosition = mLayoutManager.findFirstVisibleItemPosition()


        val shouldLoadMore = totalItemCount - visibleItemCount - firstVisibleItemPosition < thresholdRemainingItemsBeforeLoading
        if (shouldLoadMore && !isLoading() && !isLastPage()) {
            onLoadMore(++currentPage)
        }
    }
    
    abstract fun onLoadMore(page: Int)

    abstract fun isLastPage(): Boolean

    abstract fun isLoading(): Boolean

    companion object {
        const val ALLOWED_REMAINING_ITEMS_BEFORE_LOADING = 3
    }
}