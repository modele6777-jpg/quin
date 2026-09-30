package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a8f {
    public static final a8f i = new a8f(new a8f(null, 2047), 2012);
    public final boolean a;
    public final boolean b;
    public final a8f c;
    public final boolean d;
    public final a8f e;
    public final a8f f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a8f(a8f a8fVar, int i2) {
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        a8f a8fVar2 = (i2 & 32) != 0 ? null : a8fVar;
        this(z, z2, a8fVar2, true, a8fVar2, a8fVar2, (i2 & 512) == 0, (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0);
    }

    public a8f(boolean z, boolean z2, a8f a8fVar, boolean z3, a8f a8fVar2, a8f a8fVar3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = a8fVar;
        this.d = z3;
        this.e = a8fVar2;
        this.f = a8fVar3;
        this.g = z4;
        this.h = z5;
    }
}
