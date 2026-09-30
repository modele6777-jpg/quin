package defpackage;

import ai.askquin.R;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.foreground.SystemForegroundService;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.gson.JsonSyntaxException;
import io.sentry.android.core.b1;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gg7 implements ssc, r36, tcc, h1b, cu2, f1b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public gg7(zi0 zi0Var, mtf mtfVar, uv8 uv8Var) {
        f09 f09Var;
        int i;
        int i2;
        int i3 = 9;
        this.a = 9;
        this.d = zi0Var;
        this.b = new ArrayList();
        uv8 uv8Var2 = uv8Var;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            f09Var = f09.ECI;
            i = 1;
            if (uv8Var2 == null) {
                break;
            }
            int i6 = uv8Var2.c;
            int i7 = i4 + uv8Var2.d;
            uv8 uv8Var3 = uv8Var2.e;
            int i8 = i5;
            f09 f09Var2 = uv8Var2.a;
            boolean z = (f09Var2 == f09.BYTE && uv8Var3 == null && i6 != 0) || !(uv8Var3 == null || i6 == uv8Var3.c);
            i = z ? 1 : i8;
            if (uv8Var3 == null || uv8Var3.a != f09Var2 || z) {
                ((ArrayList) this.b).add(0, new vv8(this, f09Var2, uv8Var2.b, i6, i7));
                i2 = 0;
            } else {
                i2 = i7;
            }
            if (z) {
                ((ArrayList) this.b).add(0, new vv8(this, f09Var, uv8Var2.b, uv8Var2.c, 0));
            }
            i5 = i;
            uv8Var2 = uv8Var3;
            i4 = i2;
        }
        int i9 = i5;
        boolean z2 = zi0Var.a;
        cy4 cy4Var = (cy4) zi0Var.d;
        if (z2) {
            vv8 vv8Var = (vv8) ((ArrayList) this.b).get(0);
            if (vv8Var != null && vv8Var.a != f09Var && i9 != 0) {
                ((ArrayList) this.b).add(0, new vv8(this, f09Var, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((vv8) ((ArrayList) this.b).get(0)).a == f09Var ? 1 : 0, new vv8(this, f09.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i10 = mtfVar.a;
        int iOrdinal = (i10 <= 9 ? wv8.SMALL : i10 <= 26 ? wv8.MEDIUM : wv8.LARGE).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 27;
                i3 = 40;
            } else {
                i = 10;
                i3 = 26;
            }
        }
        int iQ = q(mtfVar);
        while (i10 < i3 && !dv4.c(iQ, mtf.a(i10), cy4Var)) {
            i10++;
        }
        while (i10 > i && dv4.c(iQ, mtf.a(i10 - 1), cy4Var)) {
            i10--;
        }
        this.c = mtf.a(i10);
    }

    public static gg7 f(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        gg7 gg7Var = new gg7(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) gg7Var.c)) {
            try {
                ((ArrayDeque) gg7Var.c).clear();
                String string = ((SharedPreferences) gg7Var.b).getString("topic_operation_queue", "");
                if (!TextUtils.isEmpty(string) && string.contains(",")) {
                    String[] strArrSplit = string.split(",", -1);
                    if (strArrSplit.length == 0) {
                        b1.d("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) gg7Var.c).add(str);
                        }
                    }
                    return gg7Var;
                }
                return gg7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fac h(dac dacVar, String str) {
        fac facVarH;
        fac facVar = (fac) dacVar;
        if (str.equals(facVar.c)) {
            return facVar;
        }
        for (Object obj : dacVar.a()) {
            if (obj instanceof fac) {
                fac facVar2 = (fac) obj;
                if (str.equals(facVar2.c)) {
                    return facVar2;
                }
                if ((obj instanceof dac) && (facVarH = h((dac) obj, str)) != null) {
                    return facVarH;
                }
            }
        }
        return null;
    }

    public static boolean y(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof Number)) {
            if (obj instanceof String) {
                return !((String) obj).isEmpty();
            }
            if (obj instanceof Collection) {
                return !((Collection) obj).isEmpty();
            }
            return !obj.getClass().isArray() || Array.getLength(obj) > 0;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isNaN()) {
                return false;
            }
            if (d.isInfinite()) {
                return true;
            }
        }
        if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isNaN()) {
                return false;
            }
            if (f.isInfinite()) {
                return true;
            }
        }
        return ((Number) obj).doubleValue() != 0.0d;
    }

    @Override // defpackage.r36
    public void a(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = (ViewGroup) this.c;
        View view2 = (View) this.b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            qc0.p("The media route button placeholder missing layout params.");
            return;
        }
        view.setId(R.id.exo_media_route_button_placeholder);
        view.setLayoutParams(layoutParams);
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeView(view2);
        viewGroup.addView(view, iIndexOfChild);
        view.setVisibility(0);
        ((oha) this.d).a.h(view, true);
    }

    @Override // defpackage.ssc
    public void b(rye ryeVar, n95 n95Var, xg3 xg3Var) {
        this.c = ryeVar;
        xg3Var.d();
        xg3Var.i();
        k1f k1fVarN = n95Var.n(xg3Var.c, 5);
        this.d = k1fVarN;
        k1fVarN.g((rr5) this.b);
    }

    @Override // defpackage.ssc
    public void c(d0a d0aVar) {
        long jD;
        long j;
        ((rye) this.c).getClass();
        String str = pqf.a;
        rye ryeVar = (rye) this.c;
        synchronized (ryeVar) {
            try {
                long j2 = ryeVar.c;
                jD = j2 != -9223372036854775807L ? j2 + ryeVar.b : ryeVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        rye ryeVar2 = (rye) this.c;
        synchronized (ryeVar2) {
            j = ryeVar2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        rr5 rr5Var = (rr5) this.b;
        if (j != rr5Var.u) {
            qr5 qr5VarA = rr5Var.a();
            qr5VarA.t = j;
            rr5 rr5Var2 = new rr5(qr5VarA);
            this.b = rr5Var2;
            ((k1f) this.d).g(rr5Var2);
        }
        int iA = d0aVar.a();
        ((k1f) this.d).e(iA, d0aVar);
        ((k1f) this.d).a(jD, 1, iA, 0, null);
    }

    public void d(ei7 ei7Var) {
        ((ConcurrentHashMap) this.c).put(ei7Var.c(), ei7Var);
        this.d = null;
    }

    public Object e(String str, HashMap map) throws ji7 {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        if (!concurrentHashMap.containsKey(str)) {
            try {
                concurrentHashMap.put(str, ki7.a("$", ki7.a.parse(str)));
            } catch (JsonSyntaxException e) {
                throw new ji7(e, "$");
            }
        }
        kb6 kb6Var = (kb6) this.d;
        if (kb6Var == null) {
            kb6Var = new kb6((ConcurrentHashMap) this.c);
            this.d = kb6Var;
        }
        return kb6Var.m((fi7) concurrentHashMap.get(str), map, "$");
    }

    public v79 g() {
        int i;
        float fA;
        int i2;
        aac aacVar = (aac) this.b;
        l9c l9cVar = aacVar.r;
        l9c l9cVar2 = aacVar.s;
        if (l9cVar == null || l9cVar.g() || (i = l9cVar.b) == 9 || i == 2 || i == 3) {
            return new v79(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fA2 = l9cVar.a();
        if (l9cVar2 == null) {
            v79 v79Var = ((aac) this.b).o;
            fA = v79Var != null ? (v79Var.e * fA2) / v79Var.d : fA2;
        } else {
            if (l9cVar2.g() || (i2 = l9cVar2.b) == 9 || i2 == 2 || i2 == 3) {
                return new v79(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fA = l9cVar2.a();
        }
        return new v79(0.0f, 0.0f, fA2, fA);
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 24:
                return new gg7((Context) ((h1b) this.b).get(), (w8c) ((h1b) this.c).get(), (cq0) ((y25) this.d).get(), 0);
            default:
                return new w3d((pv2) ((f1b) this.b).get(), (yxe) ((f1b) this.c).get(), (fc3) ((f1b) this.d).get());
        }
    }

    @Override // defpackage.r36
    public void i(Throwable th) {
        ((View) this.b).setVisibility(8);
    }

    public int j() {
        if (n().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((ao8) s72.v0(n().a)).a) - ((long) n().h);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public boolean k() {
        return !n().a.isEmpty();
    }

    public uo7 l() {
        uo7 uo7Var = (uo7) this.c;
        if (uo7Var != null) {
            return uo7Var;
        }
        pa7.g0("keyboardActions");
        throw null;
    }

    public int m() {
        if (n().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((ao8) s72.F0(n().a)).a) + ((long) n().h);
        long jR = ((long) r()) - 1;
        if (j > jR) {
            j = jR;
        }
        return (int) j;
    }

    public qx9 n() {
        qx9 qx9Var = (qx9) this.c;
        if (qx9Var != null) {
            return qx9Var;
        }
        pa7.g0("layoutInfo");
        throw null;
    }

    public int o() {
        if (n().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((ao8) s72.F0(n().a)).j + n().b) + n().c) - n().g);
    }

    public int p() {
        if (n().a.isEmpty()) {
            return 0;
        }
        int i = ((ao8) s72.v0(n().a)).j + (-n().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    public int q(mtf mtfVar) {
        int i = 0;
        for (vv8 vv8Var : (ArrayList) this.b) {
            int i2 = vv8Var.d;
            f09 f09Var = vv8Var.a;
            int iB = f09Var.b(mtfVar);
            int iA = iB + 4;
            int iOrdinal = f09Var.ordinal();
            if (iOrdinal == 1) {
                int i3 = ((i2 / 3) * 10) + iA;
                int i4 = i2 % 3;
                iA = i3 + (i4 != 1 ? i4 == 2 ? 7 : 0 : 4);
            } else if (iOrdinal == 2) {
                iA = ((i2 / 2) * 11) + iA + (i2 % 2 != 1 ? 0 : 6);
            } else if (iOrdinal == 4) {
                iA += vv8Var.a() * 8;
            } else if (iOrdinal == 5) {
                iA = iB + 12;
            } else if (iOrdinal == 6) {
                iA += i2 * 13;
            }
            i += iA;
        }
        return i;
    }

    public int r() {
        return ((Number) ((f12) this.b).invoke()).intValue();
    }

    public void s(f48 f48Var) {
        qzc qzcVar = (qzc) this.d;
        if (qzcVar != null) {
            qzcVar.run();
        }
        qzc qzcVar2 = new qzc((a58) this.b, f48Var);
        this.d = qzcVar2;
        ((Handler) this.c).postAtFrontOfQueue(qzcVar2);
    }

    public fac t(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
            if (strReplace.length() > 1 && strReplace.startsWith("#")) {
                String strSubstring = strReplace.substring(1);
                HashMap map = (HashMap) this.d;
                if (strSubstring.length() == 0) {
                    return null;
                }
                if (strSubstring.equals(((aac) this.b).c)) {
                    return (aac) this.b;
                }
                if (map.containsKey(strSubstring)) {
                    return (fac) map.get(strSubstring);
                }
                fac facVarH = h((aac) this.b, strSubstring);
                map.put(strSubstring, facVarH);
                return facVarH;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder();
                vv8 vv8Var = null;
                for (vv8 vv8Var2 : (ArrayList) this.b) {
                    if (vv8Var != null) {
                        sb.append(",");
                    }
                    sb.append(vv8Var2.toString());
                    vv8Var = vv8Var2;
                }
                return sb.toString();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                fz3 fz3Var = (fz3) ((fz3) this.c).c;
                String str = "";
                while (fz3Var != null) {
                    Object obj = fz3Var.b;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    fz3Var = (fz3) fz3Var.c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 14:
                String str2 = (String) this.d;
                String str3 = (String) this.c;
                StringBuilder sb3 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.b;
                if (uri != null) {
                    sb3.append(" uri=");
                    sb3.append(String.valueOf(uri));
                }
                if (str3 != null) {
                    sb3.append(" action=");
                    sb3.append(str3);
                }
                if (str2 != null) {
                    sb3.append(" mimetype=");
                    sb3.append(str2);
                }
                sb3.append(" }");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        vsd vsdVar;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            l();
        } else if (i != 1 && i != 0) {
            qc0.p("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            xn5 xn5Var = (xn5) this.d;
            if (xn5Var != null) {
                ((bo5) xn5Var).h(1, true);
                return true;
            }
            pa7.g0("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (vsdVar = (vsd) this.b) == null) {
                return false;
            }
            ((dw3) vsdVar).a();
            return true;
        }
        xn5 xn5Var2 = (xn5) this.d;
        if (xn5Var2 != null) {
            ((bo5) xn5Var2).h(2, true);
            return true;
        }
        pa7.g0("focusManager");
        throw null;
    }

    @Override // defpackage.cu2
    public Object v(Object obj) {
        kb6 kb6Var = (kb6) this.d;
        oq8 oq8Var = (oq8) this.b;
        String strD = ((wg7) kb6Var.b).d((xn7) this.c, obj);
        int i = ftb.a;
        iy9 iy9VarK = pa7.K(oq8Var);
        Charset charset = (Charset) iy9VarK.a();
        oq8 oq8Var2 = (oq8) iy9VarK.b();
        byte[] bytes = strD.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        ieg.a(bytes.length, 0L, length);
        return new etb(oq8Var2, length, bytes);
    }

    public void w(qq0 qq0Var, int i, boolean z) {
        cq0 cq0Var = (cq0) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        String str = qq0Var.a;
        adler32.update(str.getBytes(Charset.forName(Constants.ENCODING)));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        lua luaVar = qq0Var.c;
        adler32.update(byteBufferAllocate.putInt(mua.a(luaVar)).array());
        byte[] bArr = qq0Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    g21.I("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", qq0Var);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((w8c) this.c).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(mua.a(luaVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(cq0Var.a(luaVar, jLongValue, i));
            Set set = ((dq0) cq0Var.b.get(luaVar)).c;
            if (set.contains(cfc.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(cfc.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(cfc.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", mua.a(luaVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {qq0Var, Integer.valueOf(value), Long.valueOf(cq0Var.a(luaVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public lyd x(String str, a26 a26Var) {
        lyd lydVarV;
        str.getClass();
        synchronized (this.c) {
            lydVarV = ynb.V((qn2) this.b, null, dw2.b, new ap7((dg7) ((LinkedHashMap) this.d).get(str), a26Var, null), 1);
            ((LinkedHashMap) this.d).put(str, lydVarV);
            lydVarV.E(new it3(this, str, lydVarV, 16));
            lydVarV.start();
        }
        return lydVarV;
    }

    public void z() {
        w79 w79Var = (w79) this.b;
        String str = (String) this.c;
        List list = (List) w79Var.k(str);
        if (list != null) {
            list.remove((x16) this.d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        w79Var.m(str, list);
    }

    public /* synthetic */ gg7(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ gg7(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public gg7(List list) {
        this.a = 7;
        this.d = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.b).add(new h5d((List) ((mm8) list.get(i)).b.b));
            ((ArrayList) this.c).add(((mm8) list.get(i)).c.c0());
        }
    }

    public gg7(h04 h04Var, g5b g5bVar) {
        this.a = 16;
        this.b = h04Var;
        this.c = g5bVar;
        this.d = new ConcurrentHashMap();
    }

    public gg7(int i) {
        this.a = i;
        switch (i) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                String strI = ib8.i();
                a71 a71Var = a71.c;
                this.b = m8c.u(strI);
                this.c = f69.f;
                this.d = new ArrayList();
                break;
            case 21:
                long[] jArr = jec.a;
                this.b = new w79();
                break;
            default:
                this.b = new ConcurrentHashMap();
                this.c = new ConcurrentHashMap();
                d(xm8.d);
                d(xm8.e);
                d(xm8.f);
                d(xm8.g);
                d(xm8.h);
                d(xm8.i);
                d(xm8.j);
                d(hk9.b);
                d(hk9.c);
                d(hk9.d);
                d(hk9.e);
                d(vu6.b);
                d(vu6.c);
                d(eh2.c);
                d(jj.d);
                d(eh2.f);
                d(jj.g);
                d(dw8.e);
                d(dw8.f);
                d(bd0.e);
                d(bd0.f);
                d(xe8.b);
                d(jj.e);
                d(jj.c);
                d(jj.f);
                d(jj.b);
                d(bd0.c);
                d(bd0.d);
                d(eh2.e);
                d(eh2.d);
                d(eh2.b);
                d(eh2.g);
                d(dw8.c);
                d(dw8.d);
                break;
        }
    }

    public gg7(qjb qjbVar) {
        this.a = 15;
        this.b = new xh0(0);
        this.c = new a82();
        this.d = new jf6(27, this, qjbVar);
    }

    public gg7(SystemForegroundService systemForegroundService) {
        this.a = 26;
        this.b = new a58(systemForegroundService, true);
        this.c = new Handler(Looper.getMainLooper());
    }

    public gg7(rt9 rt9Var) {
        this.a = 29;
        this.b = rt9Var;
        this.c = vpf.n(1);
        this.d = vpf.o(h62.a);
    }

    public gg7(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 28;
        this.c = new ArrayDeque();
        this.b = sharedPreferences;
        this.d = scheduledThreadPoolExecutor;
    }

    public gg7(z22 z22Var, List list, gg7 gg7Var) {
        this.a = 20;
        z22Var.getClass();
        list.getClass();
        this.b = z22Var;
        this.c = list;
        this.d = gg7Var;
    }

    public gg7(Runnable runnable) {
        this.a = 8;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public gg7(qn2 qn2Var) {
        this.a = 3;
        this.b = qn2Var;
        this.c = new Object();
        this.d = new LinkedHashMap();
    }

    public gg7(String str, int i) {
        this.a = i;
        switch (i) {
            case 18:
                qr5 qr5Var = new qr5();
                qr5Var.n = qv8.l("video/mp2t");
                qr5Var.o = qv8.l(str);
                this.b = new rr5(qr5Var);
                break;
            default:
                fz3 fz3Var = new fz3(20, false);
                this.c = fz3Var;
                this.d = fz3Var;
                this.b = str;
                break;
        }
    }

    public /* synthetic */ gg7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public gg7(oha ohaVar, View view, ViewGroup viewGroup) {
        this.a = 19;
        this.d = ohaVar;
        this.b = view;
        this.c = viewGroup;
    }
}
