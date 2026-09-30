package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0h implements Runnable {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public /* synthetic */ q0h(String str, b1h b1hVar, int i, IOException iOException, byte[] bArr, Map map) {
        this.d = b1hVar;
        this.b = i;
        this.e = iOException;
        this.f = bArr;
        this.c = str;
        this.g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0h w0hVar = (w0h) this.g;
                c2h c2hVar = ((w3h) w0hVar.b).e;
                w3h.f(c2hVar);
                if (!c2hVar.c) {
                    Log.println(6, w0hVar.G0(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (w0hVar.d == 0) {
                    qqg qqgVar = ((w3h) w0hVar.b).d;
                    if (qqgVar.f == null) {
                        synchronized (qqgVar) {
                            try {
                                if (qqgVar.f == null) {
                                    w3h w3hVar = (w3h) qqgVar.b;
                                    ApplicationInfo applicationInfo = w3hVar.a.getApplicationInfo();
                                    String strY = s.y();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        qqgVar.f = Boolean.valueOf(str != null && str.equals(strY));
                                    }
                                    if (qqgVar.f == null) {
                                        qqgVar.f = Boolean.TRUE;
                                        w0h w0hVar2 = w3hVar.f;
                                        w3h.h(w0hVar2);
                                        w0hVar2.g.a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (qqgVar.f.booleanValue()) {
                        w0hVar.d = 'C';
                    } else {
                        w0hVar.d = 'c';
                    }
                    break;
                }
                long j = w0hVar.e;
                if (j < 0) {
                    ((w3h) w0hVar.b).d.G0();
                    j = 161000;
                    w0hVar.e = 161000L;
                }
                int i = this.b;
                char c = w0hVar.d;
                String str2 = this.c;
                Object obj = this.d;
                Object obj2 = this.e;
                Object obj3 = this.f;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strH0 = w0h.H0(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strH0.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strH0);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, UserMetadata.MAX_ATTRIBUTE_SIZE);
                }
                zy1 zy1Var = c2hVar.f;
                if (zy1Var != null) {
                    c2h c2hVar2 = (c2h) zy1Var.c;
                    c2hVar2.A0();
                    if (((c2h) zy1Var.c).E0().getLong("health_monitor:start", 0L) == 0) {
                        zy1Var.z();
                    }
                    long j2 = c2hVar2.E0().getLong("health_monitor:count", 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = c2hVar2.E0().edit();
                        editorEdit.putString("health_monitor:value", string);
                        editorEdit.putLong("health_monitor:count", 1L);
                        editorEdit.apply();
                        return;
                    }
                    qch qchVar = ((w3h) c2hVar2.b).w;
                    w3h.f(qchVar);
                    long jNextLong = qchVar.A1().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = c2hVar2.E0().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString("health_monitor:value", string);
                    }
                    editorEdit2.putLong("health_monitor:count", j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((b1h) this.d).a(this.c, this.b, (Throwable) this.e, (byte[]) this.f, (Map) this.g);
                return;
        }
    }

    public q0h(w0h w0hVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = w0hVar;
    }
}
