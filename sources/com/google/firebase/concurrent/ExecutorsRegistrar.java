package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.fc2;
import defpackage.kb2;
import defpackage.l01;
import defpackage.l58;
import defpackage.lb2;
import defpackage.mw7;
import defpackage.ns0;
import defpackage.pd4;
import defpackage.q13;
import defpackage.tm7;
import defpackage.uaf;
import defpackage.xb2;
import defpackage.y3b;
import defpackage.yaf;
import defpackage.yv3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final mw7 BG_EXECUTOR = new mw7(new fc2(1));
    static final mw7 LITE_EXECUTOR = new mw7(new fc2(2));
    static final mw7 BLOCKING_EXECUTOR = new mw7(new fc2(3));
    static final mw7 SCHEDULER = new mw7(new fc2(4));

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i) {
        return new q13(str, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(xb2 xb2Var) {
        return (ScheduledExecutorService) BG_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(xb2 xb2Var) {
        return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(xb2 xb2Var) {
        return (ScheduledExecutorService) LITE_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor lambda$getComponents$7(xb2 xb2Var) {
        return uaf.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$0() {
        return scheduled(Executors.newFixedThreadPool(4, factory("Firebase Background", 10, bgPolicy())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$1() {
        return scheduled(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), factory("Firebase Lite", 0, litePolicy())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$2() {
        return scheduled(Executors.newCachedThreadPool(factory("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$static$3() {
        return Executors.newSingleThreadScheduledExecutor(factory("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new yv3(executorService, (ScheduledExecutorService) SCHEDULER.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        y3b y3bVar = new y3b(ns0.class, ScheduledExecutorService.class);
        y3b[] y3bVarArr = {new y3b(ns0.class, ExecutorService.class), new y3b(ns0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(y3bVar);
        for (int i = 0; i < 2; i++) {
            tm7.q(y3bVarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, y3bVarArr);
        lb2 lb2Var = new lb2(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new pd4(8), hashSet3);
        y3b y3bVar2 = new y3b(l01.class, ScheduledExecutorService.class);
        y3b[] y3bVarArr2 = {new y3b(l01.class, ExecutorService.class), new y3b(l01.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(y3bVar2);
        for (int i2 = 0; i2 < 2; i2++) {
            tm7.q(y3bVarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, y3bVarArr2);
        lb2 lb2Var2 = new lb2(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new pd4(9), hashSet6);
        y3b y3bVar3 = new y3b(l58.class, ScheduledExecutorService.class);
        y3b[] y3bVarArr3 = {new y3b(l58.class, ExecutorService.class), new y3b(l58.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(y3bVar3);
        for (int i3 = 0; i3 < 2; i3++) {
            tm7.q(y3bVarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, y3bVarArr3);
        lb2 lb2Var3 = new lb2(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new pd4(10), hashSet9);
        kb2 kb2VarA = lb2.a(new y3b(yaf.class, Executor.class));
        kb2VarA.f = new pd4(11);
        return Arrays.asList(lb2Var, lb2Var2, lb2Var3, kb2VarA.b());
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new q13(str, i, threadPolicy);
    }
}
