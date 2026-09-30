package defpackage;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nyd implements no8 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public long c;
    public long d;
    public Object e;

    public nyd(t4c t4cVar) {
        if (t4cVar != null) {
            this.e = t4cVar;
        } else {
            r82.g("ticker");
            throw null;
        }
    }

    @Override // defpackage.no8
    public void a(nga ngaVar) {
        if (this.b) {
            d(b());
        }
        this.e = ngaVar;
    }

    @Override // defpackage.no8
    public long b() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        nga ngaVar = (nga) this.e;
        return (ngaVar.a == 1.0f ? pqf.H(jElapsedRealtime) : jElapsedRealtime * ((long) ngaVar.c)) + j;
    }

    public void d(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.no8
    public nga e() {
        return (nga) this.e;
    }

    public void f() {
        if (this.b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    public void g() {
        if (this.b) {
            qc0.p("This stopwatch is already running.");
        } else {
            this.b = true;
            this.d = ((t4c) this.e).w();
        }
    }

    public String toString() {
        TimeUnit timeUnit;
        String str;
        switch (this.a) {
            case 1:
                long jW = this.b ? (((t4c) this.e).w() - this.d) + this.c : this.c;
                long j = jW / 86400000000000L;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (j > 0) {
                    timeUnit = TimeUnit.DAYS;
                } else if (jW / 3600000000000L > 0) {
                    timeUnit = TimeUnit.HOURS;
                } else if (jW / 60000000000L > 0) {
                    timeUnit = TimeUnit.MINUTES;
                } else if (jW / 1000000000 > 0) {
                    timeUnit = TimeUnit.SECONDS;
                } else if (jW / 1000000 > 0) {
                    timeUnit = TimeUnit.MILLISECONDS;
                } else {
                    timeUnit = jW / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
                }
                String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jW / timeUnit2.convert(1L, timeUnit)));
                switch (ksg.a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = "d";
                        break;
                    default:
                        throw new AssertionError();
                }
                return ib8.j(str2, " ", str);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nyd() {
    }
}
