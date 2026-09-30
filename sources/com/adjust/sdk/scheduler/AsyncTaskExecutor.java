package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import defpackage.qe;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AsyncTaskExecutor<Params, Result> {
    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new qe(this, paramsArr, new Handler(Looper.getMainLooper()), 1));
        return this;
    }

    public void onPreExecute() {
    }

    public void onPostExecute(Result result) {
    }
}
