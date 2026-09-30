package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tga {
    public static final mc0 q = new mc0(2);
    public final Context a;
    public final rga b;
    public final SparseArray c;
    public final boolean d;
    public final gu3 e;
    public final ece f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final juf i;
    public p90 j = new p90();
    public jce k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public tga(oga ogaVar) {
        this.a = ogaVar.a;
        rga rgaVar = ogaVar.c;
        rgaVar.getClass();
        this.b = rgaVar;
        this.c = new SparseArray();
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        this.d = ogaVar.d;
        ece eceVar = ogaVar.e;
        this.f = eceVar;
        long j = ogaVar.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        juf jufVar = ogaVar.h;
        this.i = jufVar;
        this.e = new gu3(ogaVar.b, jufVar, eceVar);
        this.g = new CopyOnWriteArraySet();
        new rr5(new qr5());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
