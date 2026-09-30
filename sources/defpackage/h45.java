package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h45 {
    public static final int m;
    public static final boolean n;
    public final Context a;
    public final hj0 b;
    public final hj0 c;
    public final hj0 d;
    public final hj0 e;
    public Looper f;
    public final ysc g;
    public final iic h;
    public final sr3 i;
    public final int j;
    public final int k;
    public boolean l;

    static {
        String str = pqf.a;
        String strV = bm8.V(Build.DEVICE);
        m = (strV.contains("emulator") || strV.contains("emu64a") || strV.contains("emu64x") || strV.contains("generic") || strV.contains("vsoc")) ? Constants.CONNECTION_TIMEOUT_VERIFY : 10000;
        n = true;
    }

    public h45(Context context) {
        hj0 hj0Var = new hj0(1, context);
        hj0 hj0Var2 = new hj0(2, context);
        hj0 hj0Var3 = new hj0(3, context);
        hj0 hj0Var4 = new hj0(4, context);
        context.getClass();
        this.a = context;
        this.b = hj0Var;
        this.c = hj0Var2;
        this.d = hj0Var3;
        this.e = hj0Var4;
        String str = pqf.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        xi0 xi0Var = xi0.b;
        this.g = ysc.d;
        this.h = iic.b;
        this.i = new sr3(pqf.H(20L), pqf.H(500L));
        boolean z = n;
        this.j = z ? m : Integer.MAX_VALUE;
        this.k = z ? 60000 : Integer.MAX_VALUE;
        new m8c();
    }

    public final y45 a() {
        pa7.J(!this.l);
        this.l = true;
        return new y45(this);
    }
}
