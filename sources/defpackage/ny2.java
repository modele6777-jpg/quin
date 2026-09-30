package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Process;
import android.os.StrictMode;
import android.util.Size;
import android.view.Surface;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ny2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ny2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long j;
        boolean z;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ((hy2) ((qy2) this.b).d()).b((f76) this.c);
                return;
            case 1:
                ((hy2) ((qy2) this.b).d()).a(((mmb) this.c).element);
                return;
            case 2:
                ((hy2) ((qy2) this.b).d()).a((g76) this.c);
                return;
            case 3:
                ((hy2) ((iy2) this.b)).a(this.c);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0((iy2) this.b, (mmb) this.c);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0((iy2) this.b, (Exception) this.c);
                return;
            case 6:
                q13 q13Var = (q13) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(q13Var.c);
                StrictMode.ThreadPolicy threadPolicy = q13Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 7:
                ((a26) this.b).d((DailyFortuneGuideTrigger) this.c);
                return;
            case 8:
                ft3 ft3Var = (ft3) this.b;
                oae oaeVar = (oae) this.c;
                Surface surfaceH = oaeVar.h(ft3Var.c, new ek1(i2, ft3Var, oaeVar));
                ft3Var.a.m(surfaceH);
                ft3Var.v.put(oaeVar, surfaceH);
                return;
            case 9:
                ((ft3) this.b).y.add((po0) this.c);
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ft3 ft3Var2 = (ft3) this.b;
                wae waeVar = (wae) this.c;
                ft3Var2.w++;
                gq9 gq9Var = ft3Var2.a;
                e46.d((AtomicBoolean) gq9Var.c, true);
                e46.c((Thread) gq9Var.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(gq9Var.a);
                Size size = waeVar.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                ah6 ah6Var = ft3Var2.c;
                waeVar.b(ah6Var, new bo1(9, ft3Var2, waeVar));
                waeVar.a(surface, ah6Var, new vo2(ft3Var2, waeVar, surfaceTexture, surface, 1));
                surfaceTexture.setOnFrameAvailableListener(ft3Var2, ft3Var2.d);
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((gu3) ((a90) this.b).c).i.a((uuf) this.c);
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                lu3 lu3Var = (lu3) this.b;
                String str = (String) this.c;
                try {
                    lu3Var.e.get();
                    lu3Var.e(lu3.m.decrementAndGet(), lu3.l.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    b21.v("DeferrableSurface", "Unexpected surface termination for " + lu3Var + "\nStack Trace:\n" + str);
                    synchronized (lu3Var.a) {
                        try {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", lu3Var, Boolean.valueOf(lu3Var.c), Integer.valueOf(lu3Var.b)), e);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Callable callable = (Callable) this.b;
                aw3 aw3Var = (aw3) ((mjg) this.c).a;
                try {
                    aw3Var.k(callable.call());
                    return;
                } catch (Exception e2) {
                    aw3Var.l(e2);
                    return;
                }
            case 14:
                m74 m74Var = (m74) this.b;
                Context context = (Context) this.c;
                if (m74Var.a != null || context == null) {
                    return;
                }
                m74Var.a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case 15:
                final vq4 vq4Var = (vq4) this.b;
                wae waeVar2 = (wae) this.c;
                vq4Var.e++;
                tq4 tq4Var = vq4Var.a;
                boolean z2 = waeVar2.e;
                Size size2 = waeVar2.b;
                e46.d((AtomicBoolean) tq4Var.c, true);
                e46.c((Thread) tq4Var.e);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z2 ? tq4Var.Y : tq4Var.Z);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                waeVar2.a(surface2, vq4Var.c, new yl2() { // from class: uq4
                    @Override // defpackage.yl2
                    public final void accept(Object obj) {
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        vq4 vq4Var2 = vq4Var;
                        vq4Var2.e--;
                        vq4Var2.d();
                    }
                });
                if (z2) {
                    vq4Var.w = surfaceTexture2;
                    return;
                } else {
                    vq4Var.x = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(vq4Var, vq4Var.d);
                    return;
                }
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                vq4 vq4Var2 = (vq4) this.b;
                oae oaeVar2 = (oae) this.c;
                Surface surfaceH2 = oaeVar2.h(vq4Var2.c, new ek1(2, vq4Var2, oaeVar2));
                vq4Var2.a.m(surfaceH2);
                vq4Var2.v.put(oaeVar2, surfaceH2);
                return;
            case 17:
                y45 y45Var = (y45) this.b;
                d55 d55Var = (d55) this.c;
                int i3 = y45Var.J - d55Var.b;
                y45Var.J = i3;
                if (d55Var.e) {
                    y45Var.K = d55Var.c;
                    y45Var.L = true;
                }
                if (i3 == 0) {
                    gye gyeVar = ((mga) d55Var.f).a;
                    int i4 = -1;
                    if (!y45Var.n0.a.p() && gyeVar.p()) {
                        y45Var.o0 = -1;
                        y45Var.p0 = 0L;
                    }
                    if (!gyeVar.p()) {
                        List listAsList = Arrays.asList(((eia) gyeVar).h);
                        pa7.J(listAsList.size() == y45Var.p.size());
                        for (int i5 = 0; i5 < listAsList.size(); i5++) {
                            ((v45) y45Var.p.get(i5)).b = (gye) listAsList.get(i5);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (y45Var.L) {
                        boolean z3 = ((mga) d55Var.f).a.p() && y45Var.n0.a.p();
                        boolean zB = ((mga) d55Var.f).b.b(y45Var.n0.b);
                        boolean z4 = ((mga) d55Var.f).d == y45Var.n0.s;
                        if (z3 || (zB && z4)) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            i4 = y45Var.i();
                            if (gyeVar.p() || ((mga) d55Var.f).b.c()) {
                                j2 = ((mga) d55Var.f).d;
                            } else {
                                mga mgaVar = (mga) d55Var.f;
                                zp8 zp8Var = mgaVar.b;
                                long j3 = mgaVar.d;
                                Object obj = zp8Var.a;
                                eye eyeVar = y45Var.o;
                                gyeVar.g(obj, eyeVar);
                                j2 = j3 + eyeVar.e;
                            }
                        }
                        i = i4;
                        j = j2;
                        z = i2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    y45Var.L = false;
                    y45Var.X((mga) d55Var.f, 1, z, y45Var.K, j, i, false);
                    return;
                }
                return;
            case 18:
                fb5 fb5Var = (fb5) this.b;
                ch5 ch5Var = (ch5) this.c;
                try {
                    fb5Var.d(ch5Var);
                    db6.f1("MixpanelAPI.FeatureFlagManager", "First-time event recorded successfully: ".concat(ch5Var.a()));
                    return;
                } catch (eqb e3) {
                    db6.i1("MixpanelAPI.FeatureFlagManager", "Recording API failed for event " + ch5Var.a() + " - Service unavailable: " + e3.getMessage() + ". Event tracked locally but server may not be notified.", e3);
                    return;
                } catch (IOException e4) {
                    db6.i1("MixpanelAPI.FeatureFlagManager", "Recording API failed for event " + ch5Var.a() + " - Network error: " + e4.getMessage() + ". Event tracked locally but server may not be notified.", e4);
                    return;
                } catch (JSONException e5) {
                    db6.G("MixpanelAPI.FeatureFlagManager", "Recording API failed for event " + ch5Var.a() + " - Invalid request data: " + e5.getMessage() + ". This may indicate a bug.", e5);
                    return;
                } catch (Exception e6) {
                    db6.G("MixpanelAPI.FeatureFlagManager", "Recording API failed for event " + ch5Var.a() + " - Unexpected error: " + e6.getClass().getName() + ": " + e6.getMessage(), e6);
                    return;
                }
            case 19:
                ((pl1) this.b).F((wg6) this.c);
                return;
            case 20:
                lv6 lv6Var = (lv6) this.b;
                gle gleVar = (gle) this.c;
                try {
                    gleVar.a(lv6Var.b());
                    return;
                } catch (Exception e7) {
                    gleVar.a.r(e7);
                    return;
                }
            case 21:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i6 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 22:
                vd9 vd9Var = (vd9) this.b;
                hc2 hc2Var = (hc2) this.c;
                HashSet hashSet = new HashSet();
                if (vd9Var != null) {
                    hashSet.addAll((LinkedHashSet) vd9Var.b);
                }
                ((p74) hc2Var.g).getClass();
                return;
            case 23:
                wo8 wo8Var = (wo8) this.b;
                wo8Var.R0.set(wo8Var.y((fz3) this.c, wo8Var.L0, 0));
                return;
            case 24:
                ((sp8) this.b).i((TrackChangeEvent) this.c);
                return;
            case 25:
                ((sp8) this.b).f((NetworkEvent) this.c);
                return;
            case 26:
                ((sp8) this.b).g((PlaybackErrorEvent) this.c);
                return;
            case 27:
                ((sp8) this.b).e((PlaybackMetrics) this.c);
                return;
            case 28:
                ((sp8) this.b).h((PlaybackStateEvent) this.c);
                return;
            default:
                ((xl2) this.b).accept((fq8) this.c);
                return;
        }
    }
}
