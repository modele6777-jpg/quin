package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.gfh;
import defpackage.j8e;
import defpackage.jv2;
import defpackage.ni;
import defpackage.px2;
import defpackage.yn2;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsWorker implements Executor {
    private final ExecutorService executor;
    private final Object tailLock = new Object();
    private Task<?> tail = Tasks.d(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$0(Callable callable, Task task) {
        return Tasks.d(callable.call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$1(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$2(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$3(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$4(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task lambda$submitTaskOnSuccess$5(j8e j8eVar, Task task) {
        if (task.m()) {
            return j8eVar.then(task.i());
        }
        if (task.h() != null) {
            return Tasks.c(task.h());
        }
        gfh gfhVar = new gfh();
        gfhVar.s();
        return gfhVar;
    }

    public void await() throws InterruptedException {
        Tasks.await(submit(new ni(3)), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public Task<Void> submit(Runnable runnable) {
        Task<Void> taskG;
        synchronized (this.tailLock) {
            taskG = this.tail.g(this.executor, new jv2(17, runnable));
            this.tail = taskG;
        }
        return taskG;
    }

    public <T, R> Task<R> submitTask(Callable<Task<T>> callable, yn2 yn2Var) {
        Task taskG;
        synchronized (this.tailLock) {
            taskG = this.tail.g(this.executor, new px2(callable, 2)).g(this.executor, yn2Var);
            this.tail = taskG;
        }
        return taskG;
    }

    public <T, R> Task<R> submitTaskOnSuccess(Callable<Task<T>> callable, j8e j8eVar) {
        Task taskG;
        synchronized (this.tailLock) {
            taskG = this.tail.g(this.executor, new px2(callable, 3)).g(this.executor, new jv2(18, j8eVar));
            this.tail = taskG;
        }
        return taskG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$await$6() {
    }

    public <T> Task<T> submit(Callable<T> callable) {
        gfh gfhVar;
        synchronized (this.tailLock) {
            gfhVar = (Task<T>) this.tail.g(this.executor, new px2(callable, 0));
            this.tail = gfhVar;
        }
        return gfhVar;
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        gfh gfhVar;
        synchronized (this.tailLock) {
            gfhVar = (Task<T>) this.tail.g(this.executor, new px2(callable, 1));
            this.tail = gfhVar;
        }
        return gfhVar;
    }
}
