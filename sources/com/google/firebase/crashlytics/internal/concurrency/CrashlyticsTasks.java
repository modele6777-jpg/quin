package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.gfh;
import defpackage.gi2;
import defpackage.gle;
import defpackage.mc0;
import defpackage.sl1;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class CrashlyticsTasks {
    private static final Executor DIRECT = new mc0(1);

    private CrashlyticsTasks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task lambda$race$0(gle gleVar, AtomicBoolean atomicBoolean, sl1 sl1Var, Task task) {
        if (task.m()) {
            gleVar.c(task.i());
        } else if (task.h() != null) {
            gleVar.b(task.h());
        } else if (atomicBoolean.getAndSet(true)) {
            ((gfh) sl1Var.a.b).q(null);
        }
        return Tasks.d(null);
    }

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        sl1 sl1Var = new sl1();
        gle gleVar = new gle(sl1Var.a);
        gi2 gi2Var = new gi2(gleVar, new AtomicBoolean(false), sl1Var, 1);
        Executor executor = DIRECT;
        task.g(executor, gi2Var);
        task2.g(executor, gi2Var);
        return gleVar.a;
    }
}
