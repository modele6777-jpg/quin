package defpackage;

import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mg6 {
    public final k1f a;
    public final boolean b;
    public final boolean c;
    public final er0 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public lg6 m = new lg6();
    public lg6 n = new lg6();

    public mg6(k1f k1fVar, boolean z, boolean z2) {
        this.a = k1fVar;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
        this.g = bArr;
        this.f = new er0(bArr, 0, 0);
        this.k = false;
        this.o = false;
        lg6 lg6Var = this.n;
        lg6Var.b = false;
        lg6Var.a = false;
    }
}
