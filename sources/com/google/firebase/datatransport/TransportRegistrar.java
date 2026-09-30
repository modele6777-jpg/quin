package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.cva;
import defpackage.e71;
import defpackage.f4f;
import defpackage.kb2;
import defpackage.lb2;
import defpackage.t38;
import defpackage.w3f;
import defpackage.xb2;
import defpackage.xw3;
import defpackage.y3b;
import defpackage.y3f;
import defpackage.z7f;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y3f lambda$getComponents$0(xb2 xb2Var) {
        f4f.b((Context) xb2Var.a(Context.class));
        return f4f.a().c(e71.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y3f lambda$getComponents$1(xb2 xb2Var) {
        f4f.b((Context) xb2Var.a(Context.class));
        return f4f.a().c(e71.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y3f lambda$getComponents$2(xb2 xb2Var) {
        f4f.b((Context) xb2Var.a(Context.class));
        return f4f.a().c(e71.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        kb2 kb2VarB = lb2.b(y3f.class);
        kb2VarB.a = LIBRARY_NAME;
        kb2VarB.a(xw3.c(Context.class));
        kb2VarB.f = new cva(26);
        lb2 lb2VarB = kb2VarB.b();
        kb2 kb2VarA = lb2.a(new y3b(t38.class, y3f.class));
        kb2VarA.a(xw3.c(Context.class));
        kb2VarA.f = new cva(27);
        lb2 lb2VarB2 = kb2VarA.b();
        kb2 kb2VarA2 = lb2.a(new y3b(w3f.class, y3f.class));
        kb2VarA2.a(xw3.c(Context.class));
        kb2VarA2.f = new cva(28);
        return Arrays.asList(lb2VarB, lb2VarB2, kb2VarA2.b(), z7f.B(LIBRARY_NAME, "19.0.0"));
    }
}
