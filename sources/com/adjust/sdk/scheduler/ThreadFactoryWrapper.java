package com.adjust.sdk.scheduler;

import com.adjust.sdk.Constants;
import defpackage.ewe;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadFactoryWrapper implements ThreadFactory {
    private String source;

    public ThreadFactoryWrapper(String str) {
        this.source = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setPriority(9);
        threadNewThread.setName(Constants.THREAD_PREFIX + threadNewThread.getName() + "-" + this.source);
        threadNewThread.setDaemon(true);
        threadNewThread.setUncaughtExceptionHandler(new ewe());
        return threadNewThread;
    }
}
