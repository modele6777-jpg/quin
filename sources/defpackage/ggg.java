package defpackage;

import android.os.SystemClock;
import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.k;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ggg implements lgg {
    public final long a;
    public final int b;
    public final Object c;
    public final Serializable d;

    public ggg(long j, int i) {
        this.c = new AtomicInteger(0);
        this.d = new AtomicLong(0L);
        this.a = j;
        this.b = i <= 0 ? 1 : i;
    }

    @Override // defpackage.lgg
    public Object a() {
        int i;
        k kVar = (k) this.c;
        String str = (String) this.d;
        List listAsList = Arrays.asList(str);
        kVar.getClass();
        jgg jggVar = (jgg) ((Map) kVar.b(new vea(24, kVar, listAsList))).get(str);
        if (jggVar == null || (i = jggVar.c.d) == 5 || i == 6 || i == 4) {
            k.f.b(ib8.j("Could not find pack ", str, " while trying to complete it"), new Object[0]);
        }
        b bVar = kVar.a;
        int i2 = this.b;
        long j = this.a;
        if (bVar.c(i2, j, str).exists()) {
            b.f(bVar.c(i2, j, str));
        }
        jggVar.c.d = 4;
        return null;
    }

    public boolean b() {
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = (AtomicLong) this.d;
        if (atomicLong.get() == 0 || atomicLong.get() + this.a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.b) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }

    public /* synthetic */ ggg(k kVar, String str, int i, long j) {
        this.c = kVar;
        this.d = str;
        this.b = i;
        this.a = j;
    }
}
