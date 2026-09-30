package defpackage;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.instrumentation.file.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bx2 {
    public static final ct g = ct.d();
    public static final long h = 1000000;
    public ScheduledFuture e = null;
    public long f = -1;
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, oye oyeVar) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new ax2(this, oyeVar, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            g.f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final dx2 b(oye oyeVar) {
        long j = this.d;
        ct ctVar = g;
        if (oyeVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new f(this.c));
            try {
                long jB = oyeVar.b() + oyeVar.a;
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                long j2 = Long.parseLong(strArrSplit[13]);
                long j3 = Long.parseLong(strArrSplit[15]);
                long j4 = Long.parseLong(strArrSplit[14]);
                long j5 = Long.parseLong(strArrSplit[16]);
                cx2 cx2VarR = dx2.r();
                cx2VarR.i();
                ((dx2) cx2VarR.b).s(jB);
                double d = (j4 + j5) / j;
                long j6 = h;
                long jRound = Math.round(d * j6);
                cx2VarR.i();
                ((dx2) cx2VarR.b).t(jRound);
                long jRound2 = Math.round(((j2 + j3) / j) * j6);
                cx2VarR.i();
                ((dx2) cx2VarR.b).u(jRound2);
                dx2 dx2Var = (dx2) cx2VarR.h();
                bufferedReader.close();
                return dx2Var;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            ctVar.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            ctVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            ctVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            ctVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
