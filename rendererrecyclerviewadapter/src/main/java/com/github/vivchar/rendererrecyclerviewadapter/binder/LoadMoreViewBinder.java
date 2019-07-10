package com.github.vivchar.rendererrecyclerviewadapter.binder;

import android.content.Context;
import androidx.annotation.NonNull;

import com.github.vivchar.rendererrecyclerviewadapter.LoadMoreViewModel;
import com.github.vivchar.rendererrecyclerviewadapter.ViewHolder;

import java.util.List;

/**
 * Created by Vivchar Vitaly on 29.12.17.
 */
@SuppressWarnings("deprecation")
public class LoadMoreViewBinder extends ViewBinder<LoadMoreViewModel, ViewFinder> {

	/**
	 * Please use a constructor without Context
	 */
	@Deprecated
	public LoadMoreViewBinder(final int layoutID,
	                          @NonNull final Class<LoadMoreViewModel> type,
	                          @NonNull final Context context,
	                          @NonNull final Binder<LoadMoreViewModel, ViewFinder> binder) {
		super(layoutID, type, context, binder);
	}

	/**
	 * Please use a constructor without Context
	 */
	@Deprecated
	public LoadMoreViewBinder(final int layoutID,
	                          @NonNull final Class<LoadMoreViewModel> type,
	                          @NonNull final Context context) {
		this(layoutID, type, context, new Binder<LoadMoreViewModel, ViewFinder>() {
			@Override
			public void bindView(@NonNull final LoadMoreViewModel model,
			                     @NonNull final ViewFinder finder,
			                     @NonNull final List<Object> payloads) {}
		});
	}

	/**
	 * Please use a constructor without Context
	 */
	@Deprecated
	public LoadMoreViewBinder(final int layoutID, @NonNull final Context context) {
		this(layoutID, LoadMoreViewModel.class, context);
	}

	public LoadMoreViewBinder(final int layoutID,
	                          @NonNull final Class<LoadMoreViewModel> type,
	                          @NonNull final Binder<LoadMoreViewModel, ViewFinder> binder) {
		super(layoutID, type, binder);
	}

	public LoadMoreViewBinder(final int layoutID,
	                          @NonNull final Class<LoadMoreViewModel> type) {
		this(layoutID, type, new Binder<LoadMoreViewModel, ViewFinder>() {
			@Override
			public void bindView(@NonNull final LoadMoreViewModel model,
			                     @NonNull final ViewFinder finder,
			                     @NonNull final List<Object> payloads) {}
		});
	}

	public LoadMoreViewBinder(final int layoutID) {
		this(layoutID, LoadMoreViewModel.class);
	}
}