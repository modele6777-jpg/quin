package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a82;
import defpackage.f1b;
import defpackage.ff5;
import defpackage.gg7;
import defpackage.hc2;
import defpackage.i1b;
import defpackage.kb2;
import defpackage.kb6;
import defpackage.kd9;
import defpackage.l01;
import defpackage.lb2;
import defpackage.lqb;
import defpackage.m6c;
import defpackage.ns0;
import defpackage.of5;
import defpackage.pi4;
import defpackage.pv2;
import defpackage.qg5;
import defpackage.rg5;
import defpackage.s23;
import defpackage.sg5;
import defpackage.sv2;
import defpackage.szc;
import defpackage.t72;
import defpackage.ta0;
import defpackage.tg5;
import defpackage.ug5;
import defpackage.vea;
import defpackage.xb2;
import defpackage.xw3;
import defpackage.y3b;
import defpackage.y3f;
import defpackage.yea;
import defpackage.yg5;
import defpackage.z7c;
import defpackage.z7f;
import defpackage.ze;
import defpackage.zg5;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Llb2;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "zg5", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final zg5 Companion = new zg5();
    private static final y3b appContext = y3b.a(Context.class);
    private static final y3b firebaseApp = y3b.a(ff5.class);
    private static final y3b firebaseInstallationsApi = y3b.a(of5.class);
    private static final y3b backgroundDispatcher = new y3b(ns0.class, sv2.class);
    private static final y3b blockingDispatcher = new y3b(l01.class, sv2.class);
    private static final y3b transportFactory = y3b.a(y3f.class);
    private static final y3b firebaseSessionsComponent = y3b.a(rg5.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final qg5 getComponents$lambda$0(xb2 xb2Var) {
        return (qg5) ((s23) ((rg5) xb2Var.r(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rg5 getComponents$lambda$1(xb2 xb2Var) {
        Object objR = xb2Var.r(appContext);
        objR.getClass();
        Object objR2 = xb2Var.r(backgroundDispatcher);
        objR2.getClass();
        Object objR3 = xb2Var.r(blockingDispatcher);
        objR3.getClass();
        Object objR4 = xb2Var.r(firebaseApp);
        objR4.getClass();
        Object objR5 = xb2Var.r(firebaseInstallationsApi);
        objR5.getClass();
        i1b i1bVarQ = xb2Var.q(transportFactory);
        i1bVarQ.getClass();
        s23 s23Var = new s23();
        s23Var.a = ze.a((ff5) objR4);
        ze zeVarA = ze.a((Context) objR);
        s23Var.b = zeVarA;
        s23Var.c = pi4.a(new kb6(21, zeVarA));
        s23Var.d = pi4.a(tg5.a);
        s23Var.e = ze.a((of5) objR5);
        s23Var.f = pi4.a(new kd9(13, s23Var.a));
        ze zeVarA2 = ze.a((pv2) objR3);
        s23Var.g = zeVarA2;
        int i = 0;
        s23Var.h = pi4.a(new lqb(i, s23Var.f, zeVarA2));
        s23Var.i = ze.a((pv2) objR2);
        int i2 = 6;
        s23Var.j = pi4.a(new lqb(i2, s23Var.c, pi4.a(new a82(s23Var.d, s23Var.e, s23Var.f, s23Var.h, pi4.a(new gg7(s23Var.i, s23Var.d, pi4.a(new sg5(s23Var.b, s23Var.g, i)), 27)), 18))));
        f1b f1bVarA = pi4.a(ug5.a);
        s23Var.k = f1bVarA;
        s23Var.l = pi4.a(new vea(8, s23Var.d, f1bVarA));
        s23Var.m = pi4.a(new a82(s23Var.a, s23Var.e, s23Var.j, pi4.a(new m6c(16, ze.a(i1bVarQ))), s23Var.i, 20));
        s23Var.n = pi4.a(new ta0(s23Var.b, s23Var.g, pi4.a(new kd9(29, s23Var.l)), 25));
        f1b f1bVarA2 = pi4.a(new hc2(s23Var.j, s23Var.l, s23Var.m, s23Var.d, s23Var.n, pi4.a(new sg5(s23Var.b, s23Var.k, 1)), s23Var.i, 7));
        s23Var.o = f1bVarA2;
        s23Var.p = pi4.a(new szc(s23Var.a, s23Var.j, s23Var.i, pi4.a(new yea(f1bVarA2)), 17));
        return s23Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        kb2 kb2VarB = lb2.b(qg5.class);
        kb2VarB.a = LIBRARY_NAME;
        kb2VarB.a(xw3.b(firebaseSessionsComponent));
        kb2VarB.f = new yg5(0);
        kb2VarB.c(2);
        lb2 lb2VarB = kb2VarB.b();
        kb2 kb2VarB2 = lb2.b(rg5.class);
        kb2VarB2.a = "fire-sessions-component";
        kb2VarB2.a(xw3.b(appContext));
        kb2VarB2.a(xw3.b(backgroundDispatcher));
        kb2VarB2.a(xw3.b(blockingDispatcher));
        kb2VarB2.a(xw3.b(firebaseApp));
        kb2VarB2.a(xw3.b(firebaseInstallationsApi));
        kb2VarB2.a(new xw3(transportFactory, 1, 1));
        kb2VarB2.f = new yg5(1);
        return t72.I(lb2VarB, kb2VarB2.b(), z7f.B(LIBRARY_NAME, "3.0.7"));
    }
}
