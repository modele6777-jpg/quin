package com.google.firebase.messaging;

import com.adjust.sdk.sig.r3;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.du3;
import defpackage.ff5;
import defpackage.kb2;
import defpackage.kj6;
import defpackage.lb2;
import defpackage.of5;
import defpackage.rf5;
import defpackage.w3f;
import defpackage.xb2;
import defpackage.xq3;
import defpackage.xw3;
import defpackage.y3b;
import defpackage.y3f;
import defpackage.y6e;
import defpackage.z7f;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(y3b y3bVar, xb2 xb2Var) {
        ff5 ff5Var = (ff5) xb2Var.a(ff5.class);
        if (xb2Var.a(rf5.class) == null) {
            return new FirebaseMessaging(ff5Var, xb2Var.e(du3.class), xb2Var.e(kj6.class), (of5) xb2Var.a(of5.class), xb2Var.q(y3bVar), (y6e) xb2Var.a(y6e.class));
        }
        r3.f();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        y3b y3bVar = new y3b(w3f.class, y3f.class);
        kb2 kb2VarB = lb2.b(FirebaseMessaging.class);
        kb2VarB.a = LIBRARY_NAME;
        kb2VarB.a(xw3.c(ff5.class));
        kb2VarB.a(new xw3(0, 0, rf5.class));
        kb2VarB.a(xw3.a(du3.class));
        kb2VarB.a(xw3.a(kj6.class));
        kb2VarB.a(xw3.c(of5.class));
        kb2VarB.a(new xw3(y3bVar, 0, 1));
        kb2VarB.a(xw3.c(y6e.class));
        kb2VarB.f = new xq3(y3bVar, 1);
        kb2VarB.c(1);
        return Arrays.asList(kb2VarB.b(), z7f.B(LIBRARY_NAME, "25.1.1"));
    }
}
