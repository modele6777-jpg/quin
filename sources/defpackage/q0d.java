package defpackage;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import io.sentry.android.core.b1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0d extends gbe implements l26 {
    final /* synthetic */ n0d $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ s0d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0d(s0d s0dVar, n0d n0dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = s0dVar;
        this.$sessionDetails = n0dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q0d(this.this$0, this.$sessionDetails, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objA;
        Object objA2;
        s57 s57Var;
        s0d s0dVar;
        p0d p0dVar;
        ff5 ff5Var;
        n0d n0dVar;
        m1d m1dVar;
        Object objB;
        s0d s0dVar2;
        ff5 ff5Var2;
        n0d n0dVar2;
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber;
        fb3 fb3Var;
        fb3 fb3Var2;
        fb3 fb3Var3;
        fb3 fb3Var4;
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber2;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            s0d s0dVar3 = this.this$0;
            this.label = 1;
            int i2 = s0d.g;
            objA = s0dVar3.a(this);
            if (objA != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            jzb.q(obj);
            objA = obj;
        } else {
            if (i == 2) {
                jzb.q(obj);
                objA2 = obj;
                s57Var = (s57) objA2;
                s0dVar = this.this$0;
                p0dVar = p0d.a;
                ff5Var = s0dVar.a;
                n0dVar = this.$sessionDetails;
                m1dVar = s0dVar.c;
                xg5 xg5Var = xg5.a;
                this.L$0 = s57Var;
                this.L$1 = s0dVar;
                this.L$2 = p0dVar;
                this.L$3 = ff5Var;
                this.L$4 = n0dVar;
                this.L$5 = m1dVar;
                this.label = 3;
                objB = xg5Var.b(this);
                if (objB != bw2Var) {
                    s0dVar2 = s0dVar;
                    ff5Var2 = ff5Var;
                    n0dVar2 = n0dVar;
                }
                return bw2Var;
            }
            if (i != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m1d m1dVar2 = (m1d) this.L$5;
            n0dVar2 = (n0d) this.L$4;
            ff5Var2 = (ff5) this.L$3;
            p0dVar = (p0d) this.L$2;
            s0dVar2 = (s0d) this.L$1;
            s57 s57Var2 = (s57) this.L$0;
            jzb.q(obj);
            m1dVar = m1dVar2;
            s57Var = s57Var2;
            objB = obj;
        }
        Map map = (Map) objB;
        String str = s57Var.a;
        String str2 = s57Var.b;
        p0dVar.getClass();
        ff5Var2.getClass();
        n0dVar2.getClass();
        m1dVar.getClass();
        map.getClass();
        str2.getClass();
        String str3 = n0dVar2.a;
        String str4 = n0dVar2.b;
        int i3 = n0dVar2.c;
        long j = n0dVar2.d;
        crashlyticsAppQualitySessionsSubscriber = (CrashlyticsAppQualitySessionsSubscriber) map.get(h1d.b);
        fb3Var = fb3.COLLECTION_DISABLED;
        fb3Var2 = fb3.COLLECTION_ENABLED;
        fb3Var3 = fb3.COLLECTION_SDK_NOT_INSTALLED;
        if (crashlyticsAppQualitySessionsSubscriber == null) {
            fb3Var4 = fb3Var3;
        } else if (crashlyticsAppQualitySessionsSubscriber.isDataCollectionEnabled()) {
            fb3Var4 = fb3Var2;
        } else {
            fb3Var4 = fb3Var;
        }
        crashlyticsAppQualitySessionsSubscriber2 = (CrashlyticsAppQualitySessionsSubscriber) map.get(h1d.a);
        if (crashlyticsAppQualitySessionsSubscriber2 == null) {
            fb3Var = fb3Var3;
        } else if (crashlyticsAppQualitySessionsSubscriber2.isDataCollectionEnabled()) {
            fb3Var = fb3Var2;
        }
        o0d o0dVar = new o0d(new u0d(str3, str4, i3, j, new gb3(fb3Var4, fb3Var, m1dVar.a()), str, str2), p0d.a(ff5Var2));
        int i4 = s0d.g;
        s0dVar2.getClass();
        try {
            s0dVar2.d.a(o0dVar);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e) {
            b1.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
        }
        return wef.a;
        if (((Boolean) objA).booleanValue()) {
            of5 of5Var = this.this$0.b;
            this.label = 2;
            objA2 = s57.c.a(of5Var, this);
            if (objA2 != bw2Var) {
                s57Var = (s57) objA2;
                s0dVar = this.this$0;
                p0dVar = p0d.a;
                ff5Var = s0dVar.a;
                n0dVar = this.$sessionDetails;
                m1dVar = s0dVar.c;
                xg5 xg5Var2 = xg5.a;
                this.L$0 = s57Var;
                this.L$1 = s0dVar;
                this.L$2 = p0dVar;
                this.L$3 = ff5Var;
                this.L$4 = n0dVar;
                this.L$5 = m1dVar;
                this.label = 3;
                objB = xg5Var2.b(this);
                if (objB != bw2Var) {
                    s0dVar2 = s0dVar;
                    ff5Var2 = ff5Var;
                    n0dVar2 = n0dVar;
                    Map map2 = (Map) objB;
                    String str5 = s57Var.a;
                    String str6 = s57Var.b;
                    p0dVar.getClass();
                    ff5Var2.getClass();
                    n0dVar2.getClass();
                    m1dVar.getClass();
                    map2.getClass();
                    str6.getClass();
                    String str7 = n0dVar2.a;
                    String str8 = n0dVar2.b;
                    int i5 = n0dVar2.c;
                    long j2 = n0dVar2.d;
                    crashlyticsAppQualitySessionsSubscriber = (CrashlyticsAppQualitySessionsSubscriber) map2.get(h1d.b);
                    fb3Var = fb3.COLLECTION_DISABLED;
                    fb3Var2 = fb3.COLLECTION_ENABLED;
                    fb3Var3 = fb3.COLLECTION_SDK_NOT_INSTALLED;
                    if (crashlyticsAppQualitySessionsSubscriber == null) {
                        fb3Var4 = fb3Var3;
                    } else if (crashlyticsAppQualitySessionsSubscriber.isDataCollectionEnabled()) {
                        fb3Var4 = fb3Var2;
                    } else {
                        fb3Var4 = fb3Var;
                    }
                    crashlyticsAppQualitySessionsSubscriber2 = (CrashlyticsAppQualitySessionsSubscriber) map2.get(h1d.a);
                    if (crashlyticsAppQualitySessionsSubscriber2 == null) {
                        fb3Var = fb3Var3;
                    } else if (crashlyticsAppQualitySessionsSubscriber2.isDataCollectionEnabled()) {
                        fb3Var = fb3Var2;
                    }
                    o0d o0dVar2 = new o0d(new u0d(str7, str8, i5, j2, new gb3(fb3Var4, fb3Var, m1dVar.a()), str5, str6), p0d.a(ff5Var2));
                    int i6 = s0d.g;
                    s0dVar2.getClass();
                    s0dVar2.d.a(o0dVar2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                }
            }
            return bw2Var;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((q0d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
