package com.google.android.gms.tasks;

import android.os.Looper;
import defpackage.bkg;
import defpackage.fah;
import defpackage.g5b;
import defpackage.g94;
import defpackage.gfh;
import defpackage.hle;
import defpackage.oa7;
import defpackage.qc0;
import defpackage.r82;
import defpackage.tmg;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class Tasks {
    public static Object a(Task task) throws InterruptedException {
        oa7.z("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            qc0.p("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        oa7.B(task, "Task must not be null");
        if (task.l()) {
            return g(task);
        }
        bkg bkgVar = new bkg();
        Executor executor = hle.b;
        task.e(executor, bkgVar);
        task.d(executor, bkgVar);
        task.a(executor, bkgVar);
        bkgVar.a.await();
        return g(task);
    }

    public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) {
        oa7.z("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            qc0.p("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        oa7.B(task, "Task must not be null");
        oa7.B(timeUnit, "TimeUnit must not be null");
        if (task.l()) {
            return (TResult) g(task);
        }
        bkg bkgVar = new bkg();
        g94 g94Var = hle.b;
        task.e(g94Var, bkgVar);
        task.d(g94Var, bkgVar);
        task.a(g94Var, bkgVar);
        if (bkgVar.a.await(j, timeUnit)) {
            return (TResult) g(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static gfh b(Executor executor, Callable callable) {
        oa7.B(executor, "Executor must not be null");
        gfh gfhVar = new gfh();
        executor.execute(new fah(gfhVar, callable));
        return gfhVar;
    }

    public static gfh c(Exception exc) {
        gfh gfhVar = new gfh();
        gfhVar.r(exc);
        return gfhVar;
    }

    public static gfh d(Object obj) {
        gfh gfhVar = new gfh();
        gfhVar.p(obj);
        return gfhVar;
    }

    public static gfh e(List list) {
        if (list == null || list.isEmpty()) {
            return d(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                r82.g("null tasks are not accepted");
                return null;
            }
        }
        gfh gfhVar = new gfh();
        tmg tmgVar = new tmg(list.size(), gfhVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            g94 g94Var = hle.b;
            task.e(g94Var, tmgVar);
            task.d(g94Var, tmgVar);
            task.a(g94Var, tmgVar);
        }
        return gfhVar;
    }

    public static Task f(Task... taskArr) {
        if (taskArr.length == 0) {
            return d(Collections.EMPTY_LIST);
        }
        List listAsList = Arrays.asList(taskArr);
        return (listAsList == null || listAsList.isEmpty()) ? d(Collections.EMPTY_LIST) : e(listAsList).g(hle.a, new g5b(24, listAsList));
    }

    public static Object g(Task task) throws ExecutionException {
        if (task.m()) {
            return task.i();
        }
        if (task.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.h());
    }
}
