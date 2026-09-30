package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g3e implements bm9, yrd, g2f, j52, u26, ov2, cfg, yn2, msg {
    public final /* synthetic */ int a;
    public static final /* synthetic */ g3e b = new g3e(15);
    public static final /* synthetic */ g3e c = new g3e(16);
    public static final /* synthetic */ g3e d = new g3e(18);
    public static final /* synthetic */ g3e e = new g3e(19);
    public static final /* synthetic */ g3e f = new g3e(20);
    public static final /* synthetic */ g3e g = new g3e(21);
    public static final /* synthetic */ g3e v = new g3e(22);
    public static final /* synthetic */ g3e w = new g3e(23);
    public static final /* synthetic */ g3e x = new g3e(24);
    public static final /* synthetic */ g3e y = new g3e(25);
    public static final /* synthetic */ g3e z = new g3e(26);
    public static final /* synthetic */ g3e X = new g3e(27);
    public static final /* synthetic */ g3e Y = new g3e(28);
    public static final /* synthetic */ g3e Z = new g3e(29);

    public /* synthetic */ g3e(int i) {
        this.a = i;
    }

    public static z9e c(y9e y9eVar, w9e w9eVar, n3e n3eVar) {
        w9eVar.getClass();
        n3eVar.getClass();
        return new z9e(y9eVar, w9eVar, n3eVar);
    }

    public static mkf j(oif oifVar) {
        oifVar.getClass();
        if (oifVar instanceof wta) {
            return mkf.b;
        }
        if (oifVar instanceof hv6) {
            return mkf.c;
        }
        if (tgc.l(oifVar)) {
            return mkf.e;
        }
        return oifVar instanceof k3e ? mkf.f : mkf.g;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    public static z9e k(int i, Size size, mq0 mq0Var, int i2, x9e x9eVar, n3e n3eVar) {
        LinkedHashMap linkedHashMap = mq0Var.f;
        size.getClass();
        x9eVar.getClass();
        n3eVar.getClass();
        y9e y9eVar = (y9e) z9e.h.get(Integer.valueOf(i));
        if (y9eVar == null) {
            y9eVar = y9e.a;
        }
        w9e w9eVar = w9e.NOT_SUPPORT;
        Size size2 = jld.a;
        int height = size.getHeight() * size.getWidth();
        if (i2 == 1) {
            if (height <= jld.a((Size) mq0Var.b.get(Integer.valueOf(i)))) {
                w9eVar = w9e.S720P_16_9;
            } else if (height <= jld.a((Size) mq0Var.d.get(Integer.valueOf(i)))) {
                w9eVar = w9e.S1440P_4_3;
            }
        } else if (x9eVar == x9e.a) {
            Size size3 = (Size) linkedHashMap.get(Integer.valueOf(i));
            for (w9e w9eVar2 : z9e.f) {
                if (size.equals(w9eVar2.b())) {
                    w9eVar = w9eVar2;
                    break;
                }
            }
            if (w9eVar == w9e.NOT_SUPPORT && size.equals(size3)) {
                w9eVar = w9e.MAXIMUM;
            }
        } else {
            Size size4 = mq0Var.a;
            if (height <= size4.getHeight() * size4.getWidth()) {
                w9eVar = w9e.VGA;
            } else {
                Size size5 = mq0Var.c;
                if (height <= size5.getHeight() * size5.getWidth()) {
                    w9eVar = w9e.PREVIEW;
                } else {
                    Size size6 = mq0Var.e;
                    if (height <= size6.getHeight() * size6.getWidth()) {
                        w9eVar = w9e.RECORD;
                    } else {
                        Size size7 = (Size) linkedHashMap.get(Integer.valueOf(i));
                        Size size8 = (Size) mq0Var.i.get(Integer.valueOf(i));
                        if (size7 != null) {
                            if (height <= size7.getHeight() * size7.getWidth()) {
                                if (i2 != 2) {
                                    w9eVar = w9e.MAXIMUM;
                                } else if (size8 != null) {
                                    if (height <= size8.getHeight() * size8.getWidth()) {
                                        w9eVar = w9e.ULTRA_MAXIMUM;
                                    }
                                }
                            } else if (size8 != null) {
                                if (height <= size8.getHeight() * size8.getWidth()) {
                                    w9eVar = w9e.ULTRA_MAXIMUM;
                                }
                            }
                        } else if (i2 != 2) {
                            w9eVar = w9e.MAXIMUM;
                        } else if (size8 != null) {
                            if (height <= size8.getHeight() * size8.getWidth()) {
                                w9eVar = w9e.ULTRA_MAXIMUM;
                            }
                        }
                    }
                }
            }
        }
        return c(y9eVar, w9eVar, n3eVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x003b A[RETURN] */
    @Override // defpackage.yrd
    public boolean N(Object obj, Object obj2) {
        upe upeVar = (upe) obj;
        upe upeVar2 = (upe) obj2;
        if (upeVar == null || upeVar2 == null) {
            if ((upeVar == null) ^ (upeVar2 == null)) {
                return false;
            }
            return true;
        }
        if (upeVar.a == upeVar2.a && pa7.t(upeVar.b, upeVar2.b) && upeVar.c == upeVar2.c && upeVar.d == upeVar2.d && upeVar.e == upeVar2.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cfg
    public Object a() {
        switch (this.a) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new sfg();
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new mtb(1));
                afc.c(executorServiceNewSingleThreadExecutor);
                return executorServiceNewSingleThreadExecutor;
        }
    }

    @Override // defpackage.u26
    public Object apply(Object obj) {
        int i;
        jl2 jl2Var;
        long j;
        long jE;
        List list = (List) obj;
        uag uagVar = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        kbg kbgVar = (kbg) list.get(0);
        vag vagVar = kbgVar.b;
        List list2 = kbgVar.q;
        bb3 bb3Var = !list2.isEmpty() ? (bb3) list2.get(0) : bb3.b;
        UUID uuidFromString = UUID.fromString(kbgVar.a);
        uuidFromString.getClass();
        HashSet hashSet = new HashSet(kbgVar.p);
        bb3 bb3Var2 = kbgVar.c;
        int i2 = kbgVar.h;
        int i3 = kbgVar.m;
        jl2 jl2Var2 = kbgVar.g;
        long j2 = kbgVar.d;
        long j3 = kbgVar.e;
        if (j3 != 0) {
            uagVar = new uag(j3, kbgVar.f);
        }
        vag vagVar2 = vag.a;
        if (vagVar == vagVar2) {
            String str = lbg.z;
            boolean z2 = vagVar == vagVar2 && i2 > 0;
            j = j2;
            jl2Var = jl2Var2;
            i = i3;
            jE = z8c.e(z2, i2, kbgVar.i, kbgVar.j, kbgVar.k, kbgVar.l, j3 != 0, j, kbgVar.f, j3, kbgVar.n);
        } else {
            i = i3;
            jl2Var = jl2Var2;
            j = j2;
            i2 = i2;
            jE = Long.MAX_VALUE;
        }
        return new wag(uuidFromString, vagVar, hashSet, bb3Var2, bb3Var, i2, i, jl2Var, j, uagVar, jE, kbgVar.o);
    }

    @Override // defpackage.msg
    public Object b() {
        switch (this.a) {
            case 18:
                ((yog) tog.b.a.get()).getClass();
                return new Boolean(((Boolean) yog.a.get()).booleanValue());
            case 19:
                ((kpg) jpg.b.a.get()).getClass();
                return new Boolean(((Boolean) kpg.a.get()).booleanValue());
            case 20:
                List list = bzg.a;
                ((cpg) bpg.b.a.get()).getClass();
                return (String) cpg.a.get();
            case 21:
                List list2 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 22:
                List list3 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 23:
                List list4 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
            case 24:
                List list5 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            case 25:
                List list6 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 26:
                List list7 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(5, 86400000L, "measurement.config.cache_time").get();
            case 27:
                List list8 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(33, 10000L, "measurement.upload.realtime_upload_interval").get();
            case 28:
                List list9 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
            default:
                List list10 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(77, 1800000L, "measurement.upload.retry_time").get();
        }
    }

    @Override // defpackage.bm9
    public xsc d() {
        return new ir0(-9223372036854775807L);
    }

    @Override // defpackage.j52
    public long e() {
        return SystemClock.elapsedRealtime();
    }

    public o8f g(j7f j7fVar, List list) {
        j7fVar.getClass();
        list.getClass();
        List parameters = j7fVar.getParameters();
        parameters.getClass();
        c8f c8fVar = (c8f) s72.H0(parameters);
        if (c8fVar != null) {
            int i = 1;
            if (c8fVar.Q()) {
                List parameters2 = j7fVar.getParameters();
                parameters2.getClass();
                ArrayList arrayList = new ArrayList(t72.u(parameters2, 10));
                Iterator it = parameters2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c8f) it.next()).h());
                }
                return new ezd(i, bm8.W(s72.r1(arrayList, list)));
            }
        }
        return new m17((c8f[]) parameters.toArray(new c8f[0]), (i8f[]) list.toArray(new i8f[0]), false);
    }

    @Override // defpackage.yn2
    public /* synthetic */ Object h(Task task) throws IOException {
        switch (this.a) {
            case 15:
                Intent intent = (Intent) ((Bundle) task.i()).getParcelable("notification_data");
                if (intent != null) {
                    return new i62(intent);
                }
                return null;
            default:
                if (task.m()) {
                    return (Bundle) task.i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.h())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.h());
        }
    }

    @Override // defpackage.bm9
    public long a(m95 m95Var) {
        return -1L;
    }

    @Override // defpackage.bm9
    public void f(long j) {
    }
}
