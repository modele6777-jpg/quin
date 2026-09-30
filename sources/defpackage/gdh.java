package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gdh {
    public static Boolean d;
    public final f8h a;
    public final Uri b;
    public final String c;

    public gdh(f8h f8hVar, String str) {
        this.a = f8hVar;
        this.c = str;
        Context context = f8hVar.b;
        Pattern pattern = ceh.a;
        hbc hbcVar = new hbc(context, 17);
        hbcVar.V0("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        hbcVar.W0(sb.toString());
        this.b = hbcVar.X0();
    }

    public final kv a() {
        String strSubstring;
        int i;
        uah uahVar;
        uah uahVar2;
        String str = this.c;
        f8h f8hVar = this.a;
        u8e u8eVar = f8hVar.f;
        if (!i7h.O(f8hVar.b)) {
            return new kv(idh.y(), new h71(3, 17, 10));
        }
        Boolean boolValueOf = d;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
                d = boolValueOf;
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    boolValueOf = (Boolean) objInvoke;
                    d = boolValueOf;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                    d = boolValueOf;
                }
            }
        }
        if (boolValueOf.booleanValue()) {
            return new kv(idh.y(), new h71(3, 18, 10));
        }
        fdh fdhVarB = f8hVar.g.b();
        xlg xlgVar = fdhVarB.c;
        mlg mlgVar = mlg.FILE;
        kd0 kd0Var = a8h.a;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                qc0.j("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        if (!fdhVarB.h) {
            i = 14;
        } else if (!fdhVarB.a || !fdhVarB.b.contains(mlgVar)) {
            i = 3;
        } else if (xlgVar.c() != 0) {
            List list = fdhVarB.f;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = fdhVarB.g.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        if (i != 0) {
            uahVar2 = new uah(null, new h71(i));
        } else {
            try {
                String str2 = fdhVarB.e;
                if (str2.isEmpty()) {
                    vr9 vr9Var = (vr9) f8hVar.h.get();
                    if (vr9Var.b()) {
                        str2 = ((ApplicationInfo) vr9Var.a()).dataDir;
                    } else {
                        sfc.n(Level.WARNING, f8hVar.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        uahVar = new uah(eah.c, new h71(3, 7, 10));
                        uahVar2 = uahVar;
                    }
                }
                String str3 = File.separator;
                String str4 = fdhVarB.d;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                psd psdVar = new psd(xlgVar, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = psdVar.D().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        uah uahVar3 = new uah((eah) ((xdh) u8eVar.get()).a(uriBuild, new f17(fdhVarB.k.r(), 9)), new h71(5, 2, 10));
                        StrictMode.setThreadPolicy(threadPolicy);
                        uahVar2 = uahVar3;
                    } catch (bng e) {
                        sfc.n(Level.SEVERE, f8hVar.a(), e, "Failed to parse snapshot from shared storage for %s", str);
                        uahVar2 = new uah(null, new h71(9));
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (FileNotFoundException unused2) {
                        sfc.n(Level.INFO, f8hVar.a(), null, "Shared storage file not found for %s", str);
                        uahVar2 = new uah(null, new h71(8));
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            } catch (Exception e2) {
                sfc.n(Level.WARNING, f8hVar.a(), e2, "Failed to read shared file for %s", str);
                uahVar = new uah(eah.c, new h71(3, 10, 10));
            }
        }
        h71 h71Var = uahVar2.b;
        eah eahVar = uahVar2.a;
        if (eahVar != null) {
            return new kv(eahVar, h71Var);
        }
        int i2 = h71Var.c;
        try {
            xdh xdhVar = (xdh) u8eVar.get();
            Uri uri = this.b;
            tng tngVar = (tng) idh.y().q(7);
            hmg hmgVar = hmg.a;
            int i3 = slg.a;
            hmg hmgVar2 = hmg.b;
            InputStream inputStreamO = drb.o(xdhVar.b(uri));
            try {
                omg omgVarA = ((nmg) tngVar).a(inputStreamO, hmgVar2);
                if (inputStreamO != null) {
                    inputStreamO.close();
                }
                return new kv((idh) omgVarA, new h71(4, i2, 10));
            } catch (Throwable th2) {
                if (inputStreamO == null) {
                    throw th2;
                }
                try {
                    inputStreamO.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException | RuntimeException unused3) {
            sfc.n(Level.INFO, f8hVar.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return b() ? new kv(eah.c, new h71(3, 16, 10)) : new kv(idh.y(), new h71(3, 11, 10));
        }
    }

    public final boolean b() {
        jah jahVarC = this.a.g.c();
        return jahVarC.t() && ((AbstractCollection) jahVarC.y()).contains(mlg.FILE);
    }
}
