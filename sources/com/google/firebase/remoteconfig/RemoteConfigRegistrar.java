package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bf5;
import defpackage.bqb;
import defpackage.ff5;
import defpackage.kb2;
import defpackage.l01;
import defpackage.lb2;
import defpackage.lg5;
import defpackage.ml;
import defpackage.of5;
import defpackage.x5;
import defpackage.xb2;
import defpackage.xq3;
import defpackage.xw3;
import defpackage.y3b;
import defpackage.z7f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static bqb lambda$getComponents$0(y3b y3bVar, xb2 xb2Var) {
        bf5 bf5Var;
        Context context = (Context) xb2Var.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) xb2Var.r(y3bVar);
        ff5 ff5Var = (ff5) xb2Var.a(ff5.class);
        of5 of5Var = (of5) xb2Var.a(of5.class);
        x5 x5Var = (x5) xb2Var.a(x5.class);
        synchronized (x5Var) {
            try {
                if (!x5Var.a.containsKey("frc")) {
                    x5Var.a.put("frc", new bf5(x5Var.b));
                }
                bf5Var = (bf5) x5Var.a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new bqb(context, scheduledExecutorService, ff5Var, of5Var, bf5Var, xb2Var.e(ml.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        y3b y3bVar = new y3b(l01.class, ScheduledExecutorService.class);
        kb2 kb2Var = new kb2(bqb.class, lg5.class);
        kb2Var.a = LIBRARY_NAME;
        kb2Var.a(xw3.c(Context.class));
        kb2Var.a(new xw3(y3bVar, 1, 0));
        kb2Var.a(xw3.c(ff5.class));
        kb2Var.a(xw3.c(of5.class));
        kb2Var.a(xw3.c(x5.class));
        kb2Var.a(xw3.a(ml.class));
        kb2Var.f = new xq3(y3bVar, 3);
        kb2Var.c(2);
        return Arrays.asList(kb2Var.b(), z7f.B(LIBRARY_NAME, "23.1.0"));
    }
}
