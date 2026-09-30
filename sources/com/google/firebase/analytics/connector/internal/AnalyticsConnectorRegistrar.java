package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ff5;
import defpackage.g94;
import defpackage.hz4;
import defpackage.kb2;
import defpackage.lb2;
import defpackage.ml;
import defpackage.nl;
import defpackage.oa7;
import defpackage.uzd;
import defpackage.vxg;
import defpackage.xb2;
import defpackage.xw3;
import defpackage.y6e;
import defpackage.z7f;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static ml lambda$getComponents$0(xb2 xb2Var) {
        ff5 ff5Var = (ff5) xb2Var.a(ff5.class);
        Context context = (Context) xb2Var.a(Context.class);
        y6e y6eVar = (y6e) xb2Var.a(y6e.class);
        oa7.A(ff5Var);
        oa7.A(context);
        oa7.A(y6eVar);
        oa7.A(context.getApplicationContext());
        if (nl.c == null) {
            synchronized (nl.class) {
                try {
                    if (nl.c == null) {
                        Bundle bundle = new Bundle(1);
                        ff5Var.a();
                        if ("[DEFAULT]".equals(ff5Var.b)) {
                            ((hz4) y6eVar).a(g94.e, uzd.c);
                            bundle.putBoolean("dataCollectionDefaultEnabled", ff5Var.h());
                        }
                        nl.c = new nl(vxg.e(context, bundle).b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nl.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        kb2 kb2VarB = lb2.b(ml.class);
        kb2VarB.a(xw3.c(ff5.class));
        kb2VarB.a(xw3.c(Context.class));
        kb2VarB.a(xw3.c(y6e.class));
        kb2VarB.f = uzd.d;
        kb2VarB.c(2);
        return Arrays.asList(kb2VarB.b(), z7f.B("fire-analytics", "23.2.0"));
    }
}
