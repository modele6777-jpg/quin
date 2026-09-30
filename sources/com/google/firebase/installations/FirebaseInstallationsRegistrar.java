package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ff5;
import defpackage.hj6;
import defpackage.ij6;
import defpackage.jb2;
import defpackage.kb2;
import defpackage.kyc;
import defpackage.l01;
import defpackage.lb2;
import defpackage.nf5;
import defpackage.ns0;
import defpackage.of5;
import defpackage.pd4;
import defpackage.xb2;
import defpackage.xw3;
import defpackage.y3b;
import defpackage.z7f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static of5 lambda$getComponents$0(xb2 xb2Var) {
        return new nf5((ff5) xb2Var.a(ff5.class), xb2Var.e(ij6.class), (ExecutorService) xb2Var.r(new y3b(ns0.class, ExecutorService.class)), new kyc((Executor) xb2Var.r(new y3b(l01.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        kb2 kb2VarB = lb2.b(of5.class);
        kb2VarB.a = LIBRARY_NAME;
        kb2VarB.a(xw3.c(ff5.class));
        kb2VarB.a(xw3.a(ij6.class));
        int i = 0;
        kb2VarB.a(new xw3(new y3b(ns0.class, ExecutorService.class), 1, 0));
        kb2VarB.a(new xw3(new y3b(l01.class, Executor.class), 1, 0));
        kb2VarB.f = new pd4(25);
        lb2 lb2VarB = kb2VarB.b();
        hj6 hj6Var = new hj6(i);
        kb2 kb2VarB2 = lb2.b(hj6.class);
        kb2VarB2.e = 1;
        kb2VarB2.f = new jb2(i, hj6Var);
        return Arrays.asList(lb2VarB, kb2VarB2.b(), z7f.B(LIBRARY_NAME, "19.1.2"));
    }
}
