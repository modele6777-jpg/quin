package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r8g {
    public static final q69 a;
    public static final p8g[] b;

    static {
        q69 q69Var = new q69(8);
        p8g.a.getClass();
        q8g q8gVar = o8g.g;
        q69Var.i(1, q8gVar);
        q8g q8gVar2 = o8g.f;
        q69Var.i(2, q8gVar2);
        q8g q8gVar3 = o8g.b;
        q69Var.i(4, q8gVar3);
        q8g q8gVar4 = o8g.d;
        q69Var.i(8, q8gVar4);
        q8g q8gVar5 = o8g.h;
        q69Var.i(16, q8gVar5);
        q8g q8gVar6 = o8g.e;
        q69Var.i(32, q8gVar6);
        q8g q8gVar7 = o8g.i;
        q69Var.i(64, q8gVar7);
        q8g q8gVar8 = o8g.c;
        q69Var.i(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, q8gVar8);
        a = q69Var;
        b = new p8g[]{q8gVar, q8gVar2, q8gVar3, q8gVar7, q8gVar5, q8gVar6, q8gVar4, o8g.j, q8gVar8};
    }

    public static final void a(kg8 kg8Var, d47 d47Var, long j, int i, int i2) {
        if (m7c.d(j, -1L)) {
            return;
        }
        kg8Var.a(d47Var.b, (int) ((j >>> 48) & 65535));
        kg8Var.a(d47Var.c, (int) ((j >>> 32) & 65535));
        kg8Var.a(d47Var.d, i - ((int) ((j >>> 16) & 65535)));
        kg8Var.a(d47Var.e, i2 - ((int) (j & 65535)));
    }
}
