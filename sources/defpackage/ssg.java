package defpackage;

import ai.askquin.ui.persistence.serialization.r0;
import android.os.Message;
import android.util.Log;
import android.view.Window;
import android.widget.EditText;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.compose.ui.node.LayoutNode;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.ReferrerDetails;
import io.sentry.android.core.b1;
import java.util.BitSet;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ssg implements InstallReferrerReadListener, ks8, vdb, ha1, lla, mjd, g1b, ye, lwa {
    public static volatile ssg c;
    public final /* synthetic */ int a;
    public final Object b;

    public ssg(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = qu4.a;
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                this.b = new ktd(tq.f);
                break;
            case 14:
                this.b = new r0();
                break;
            case 24:
                this.b = new p89(0, new uy7[16]);
                break;
            case 25:
                this.b = (ExtraCroppingQuirk) s74.a().b(ExtraCroppingQuirk.class);
                break;
            case 28:
                x79 x79Var = mec.a;
                this.b = new x79();
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }

    public static mjg E() {
        return new mjg(new BitSet());
    }

    @Override // defpackage.ks8
    public boolean B(qr8 qr8Var) {
        Window.Callback callback = ((q80) this.b).z.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, qr8Var);
        return true;
    }

    public void D(LayoutNode layoutNode) {
        if (!layoutNode.W()) {
            i37.c("DepthSortedSet.add called on an unattached node");
        }
        ((ktd) this.b).add(layoutNode);
    }

    public ez5 F() {
        return null;
    }

    public yp4 G() {
        return (yp4) this.b;
    }

    public UUID H() {
        return d71.a;
    }

    public int I() {
        return 1;
    }

    public void J(String str) {
        synchronized (((tx8) this.b).g) {
            p9a p9aVar = ((tx8) this.b).g;
            synchronized (p9aVar) {
                try {
                    if (!p9aVar.i) {
                        p9aVar.d();
                    }
                    p9aVar.l = str;
                    p9aVar.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        tx8 tx8Var = (tx8) this.b;
        zl zlVar = tx8Var.b;
        wl wlVar = new wl(str, tx8Var.e);
        zlVar.getClass();
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = wlVar;
        zlVar.b.a(messageObtain);
    }

    public void K(String str, double d) {
        tx8 tx8Var = (tx8) this.b;
        if (tx8Var.f()) {
            return;
        }
        HashMap map = new HashMap();
        map.put(str, Double.valueOf(d));
        if (tx8Var.f()) {
            return;
        }
        try {
            tx8Var.h(O(new JSONObject(map), "$add"));
        } catch (JSONException e) {
            db6.G("MixpanelAPI.API", "Exception incrementing properties", e);
        }
    }

    public mjg L() {
        return new mjg((BitSet) ((BitSet) this.b).clone());
    }

    public boolean N(LayoutNode layoutNode) {
        if (!layoutNode.W()) {
            i37.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((ktd) this.b).remove(layoutNode);
    }

    public JSONObject O(Object obj, String str) throws JSONException {
        String str2;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        p9a p9aVar = ((tx8) this.b).g;
        synchronized (p9aVar) {
            try {
                if (!p9aVar.i) {
                    p9aVar.d();
                }
                str2 = p9aVar.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        tx8 tx8Var = (tx8) this.b;
        String strE = tx8Var.e();
        jSONObject.put(str, obj);
        jSONObject.put("$token", tx8Var.e);
        jSONObject.put("$time", System.currentTimeMillis());
        p9a p9aVar2 = tx8Var.g;
        synchronized (p9aVar2) {
            try {
                if (!p9aVar2.i) {
                    p9aVar2.d();
                }
                z = p9aVar2.n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jSONObject.put("$had_persisted_distinct_id", z);
        if (strE != null) {
            jSONObject.put("$device_id", strE);
        }
        if (str2 != null) {
            jSONObject.put("$distinct_id", str2);
            jSONObject.put("$user_id", str2);
        }
        jSONObject.put("$mp_metadata", tx8Var.j.a(false));
        return jSONObject;
    }

    @Override // defpackage.ks8
    public void d(qr8 qr8Var, boolean z) {
        ((q80) this.b).t(qr8Var);
    }

    @Override // defpackage.h1b
    public Object get() {
        of5 of5Var = (of5) ((szc) this.b).c;
        nk8.o(of5Var);
        return of5Var;
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        xe xeVar = (xe) obj;
        zx5 zx5Var = (zx5) this.b;
        vx5 vx5Var = (vx5) zx5Var.F.pollLast();
        if (vx5Var == null) {
            b1.l("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = vx5Var.a;
        int i = vx5Var.b;
        kx5 kx5VarG = zx5Var.c.G(str);
        if (kx5VarG != null) {
            kx5VarG.r(i, xeVar.a, xeVar.b);
            return;
        }
        b1.l("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.vdb
    public qh2 k() {
        return (qh2) this.b;
    }

    @Override // defpackage.mjd
    public void lock() {
        ((ReentrantLock) this.b).lock();
    }

    @Override // defpackage.lwa
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.lwa
    public void n(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            b1.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onFail(String str) {
        ((ActivityHandler) this.b).logger.debug(str, new Object[0]);
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
        ((ActivityHandler) this.b).sendInstallReferrer(referrerDetails, str);
    }

    @Override // defpackage.ha1
    public void p(u91 u91Var, qyb qybVar) {
        ((ab2) this.b).complete(qybVar);
    }

    public String toString() {
        switch (this.a) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return ((ktd) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mjd
    public void unlock() {
        ((ReentrantLock) this.b).unlock();
    }

    @Override // defpackage.ha1
    public void w(u91 u91Var, Throwable th) {
        ((ab2) this.b).completeExceptionally(th);
    }

    @Override // defpackage.lla
    public long x(a77 a77Var, long j, cv7 cv7Var, long j2) {
        long j3 = ((w67) ((x16) this.b).invoke()).a;
        int iR = bm8.r(a77Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), cv7Var == cv7.a);
        return (((long) bm8.r(a77Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iR) << 32);
    }

    public void C(aq4 aq4Var) {
    }

    public void M(aq4 aq4Var) {
    }

    public /* synthetic */ ssg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ssg(mjg mjgVar) {
        this.a = 3;
        this.b = (BitSet) mjgVar.a;
    }

    public ssg(k9b k9bVar) {
        this.a = 22;
        this.b = (IncorrectJpegMetadataQuirk) k9bVar.b(IncorrectJpegMetadataQuirk.class);
    }

    public ssg(EditText editText) {
        this.a = 15;
        this.b = new w84(editText);
    }
}
