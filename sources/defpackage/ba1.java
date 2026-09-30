package defpackage;

import android.os.Build;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Annotation;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import tech.chatmind.api.LegacyImportRequest;
import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ba1 implements i87 {
    public static final ba1 b = new ba1(0);
    public static final ba1 c = new ba1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ba1(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0148  */
    /* JADX WARN: Code duplicated, block: B:113:0x014f  */
    /* JADX WARN: Code duplicated, block: B:116:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    public static btb b(ryb rybVar, zi0 zi0Var, oib oibVar) throws ProtocolException {
        String strC;
        btb btbVar;
        bt6 bt6Var;
        ct6 ct6VarA;
        zsb zsbVarA;
        boolean z;
        ftb ftbVar;
        ryb rybVar2;
        e7c e7cVar = zi0Var != null ? zi0Var.o().c : null;
        int i = rybVar.d;
        btb btbVar2 = rybVar.a;
        String str = btbVar2.b;
        if (i == 307 || i == 308) {
            if (oibVar.a.a.h) {
                strC = rybVar.f.c("Location");
                if (strC == null) {
                    strC = null;
                }
                btbVar = rybVar.a;
                if (strC != null) {
                    ct6 ct6Var = btbVar.a;
                    ct6Var.getClass();
                    try {
                        bt6Var = new bt6();
                        bt6Var.d(ct6Var, strC);
                    } catch (IllegalArgumentException unused) {
                        bt6Var = null;
                    }
                    if (bt6Var != null) {
                        ct6VarA = bt6Var.a();
                    } else {
                        ct6VarA = null;
                    }
                    if (ct6VarA != null && (pa7.t(ct6VarA.a, btbVar.a.a) || oibVar.a.a.i)) {
                        zsbVarA = btbVar.a();
                        if (ym8.E(str)) {
                            int i2 = rybVar.d;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                zsbVarA.b(str, z ? btbVar.d : null);
                            } else {
                                zsbVarA.b("GET", null);
                            }
                            if (!z) {
                                zsbVarA.c.f("Transfer-Encoding");
                                zsbVarA.c.f("Content-Length");
                                zsbVarA.c.f("Content-Type");
                            }
                        }
                        if (!keg.a(btbVar.a, ct6VarA)) {
                            zsbVarA.c.f("Authorization");
                        }
                        zsbVarA.a = ct6VarA;
                        return new btb(zsbVarA);
                    }
                }
            }
        } else {
            if (i == 401) {
                oibVar.i.getClass();
                return null;
            }
            if (i == 421) {
                ftb ftbVar2 = btbVar2.d;
                if ((ftbVar2 == null || !ftbVar2.c()) && zi0Var != null && !pa7.t(((v25) zi0Var.c).d().i.h.d, ((u25) zi0Var.d).j().h().a.h.d)) {
                    dib dibVarO = zi0Var.o();
                    synchronized (dibVarO) {
                        dibVarO.k = true;
                    }
                    return rybVar.a;
                }
            } else if (i == 503) {
                ryb rybVar3 = rybVar.y;
                if ((rybVar3 == null || rybVar3.d != 503) && e(rybVar, Integer.MAX_VALUE) == 0) {
                    return rybVar.a;
                }
            } else {
                if (i == 407) {
                    e7cVar.getClass();
                    if (e7cVar.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    oibVar.p.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            if (oibVar.a.a.h) {
                                strC = rybVar.f.c("Location");
                                if (strC == null) {
                                    strC = null;
                                }
                                btbVar = rybVar.a;
                                if (strC != null) {
                                    ct6 ct6Var2 = btbVar.a;
                                    ct6Var2.getClass();
                                    bt6Var = new bt6();
                                    bt6Var.d(ct6Var2, strC);
                                    if (bt6Var != null) {
                                        ct6VarA = bt6Var.a();
                                    } else {
                                        ct6VarA = null;
                                    }
                                    if (ct6VarA != null) {
                                        zsbVarA = btbVar.a();
                                        if (ym8.E(str)) {
                                            int i3 = rybVar.d;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                zsbVarA.b(str, z ? btbVar.d : null);
                                            } else {
                                                zsbVarA.b(str, z ? btbVar.d : null);
                                            }
                                            if (!z) {
                                                zsbVarA.c.f("Transfer-Encoding");
                                                zsbVarA.c.f("Content-Length");
                                                zsbVarA.c.f("Content-Type");
                                            }
                                        }
                                        if (!keg.a(btbVar.a, ct6VarA)) {
                                            zsbVarA.c.f("Authorization");
                                        }
                                        zsbVarA.a = ct6VarA;
                                        return new btb(zsbVarA);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (oibVar.r && (((ftbVar = btbVar2.d) == null || !ftbVar.c()) && (((rybVar2 = rybVar.y) == null || rybVar2.d != 408) && e(rybVar, 0) <= 0))) {
                    return rybVar.a;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x029b  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:137:0x0312 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0314  */
    /* JADX WARN: Code duplicated, block: B:139:0x0318 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x031a  */
    /* JADX WARN: Code duplicated, block: B:142:0x031f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x0321  */
    /* JADX WARN: Code duplicated, block: B:145:0x0349  */
    /* JADX WARN: Code duplicated, block: B:155:0x037b  */
    /* JADX WARN: Code duplicated, block: B:240:0x057a  */
    /* JADX WARN: Code duplicated, block: B:259:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:261:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:262:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:265:0x060e  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Multi-variable type inference failed */
    private final ryb c(oib oibVar) {
        ryb rybVar;
        int i;
        long j;
        long time;
        Date dateA;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        a90 a90Var;
        long j2;
        long time2;
        String string;
        int i2;
        int i3;
        long millis;
        long millis2;
        String str4;
        String str5;
        long j3;
        pyb pybVarH;
        int i4;
        ryb rybVar2;
        kv kvVar;
        String strC;
        String str6;
        zi0 zi0VarL;
        zi0 zi0VarL2;
        a81 a81Var = oibVar.j;
        if (a81Var != null) {
            btb btbVar = oibVar.e;
            btbVar.getClass();
            ct6 ct6Var = btbVar.a;
            try {
                q94 q94VarU = a81Var.a.u(urg.G(ct6Var));
                if (q94VarU == null) {
                    rybVar = null;
                } else {
                    try {
                        y71 y71Var = new y71((mtd) q94VarU.c.get(0));
                        String str7 = y71Var.c;
                        si6 si6Var = y71Var.b;
                        ct6 ct6Var2 = y71Var.a;
                        si6 si6Var2 = y71Var.g;
                        String strC2 = si6Var2.c("Content-Type");
                        String strC3 = si6Var2.c("Content-Length");
                        ct6Var2.getClass();
                        si6Var.getClass();
                        str7.getClass();
                        zsb zsbVar = new zsb();
                        zsbVar.a = ct6Var2;
                        zsbVar.c = xdc.j(si6Var);
                        zsbVar.b(!str7.equals(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR) ? str7 : "GET", null);
                        btb btbVar2 = new btb(zsbVar);
                        tyb tybVar = vyb.b;
                        g3e g3eVar = g2f.d0;
                        new qi6();
                        a1b a1bVar = y71Var.d;
                        a1bVar.getClass();
                        int i5 = y71Var.e;
                        String str8 = y71Var.f;
                        str8.getClass();
                        qi6 qi6VarJ = xdc.j(si6Var2);
                        x71 x71Var = new x71(q94VarU, strC2, strC3);
                        bh6 bh6Var = y71Var.h;
                        long j4 = y71Var.i;
                        long j5 = y71Var.j;
                        if (i5 < 0) {
                            ho7.j(tec.e(i5, "code < 0: "));
                            return null;
                        }
                        rybVar = new ryb(btbVar2, a1bVar, str8, i5, bh6Var, xdc.h(qi6VarJ), x71Var, null, null, null, null, j4, j5, null, g3eVar);
                        if (ct6Var2.equals(ct6Var) && str7.equals(btbVar.b)) {
                            Set setS = urg.S(rybVar.f);
                            if (!(setS instanceof Collection) || !setS.isEmpty()) {
                                Iterator it = setS.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str9 = (String) it.next();
                                        if (!si6Var.e(str9).equals(btbVar.c.e(str9))) {
                                        }
                                    }
                                }
                            }
                        }
                        ieg.b(rybVar.g);
                        rybVar = null;
                    } catch (IOException unused) {
                        ieg.b(q94VarU);
                    }
                }
            } catch (IOException unused2) {
            }
        } else {
            rybVar = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        btb btbVar3 = oibVar.e;
        btbVar3.getClass();
        if (rybVar != null) {
            j = rybVar.z;
            time = rybVar.X;
            si6 si6Var3 = rybVar.f;
            int size = si6Var3.size();
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
            int iO = -1;
            for (int i6 = 0; i6 < size; i6++) {
                String strI = xdc.i(si6Var3, i6);
                String strK = xdc.k(si6Var3, i6);
                if (strI.equalsIgnoreCase("Date")) {
                    dateA3 = ae3.a(strK);
                    str3 = strK;
                } else if (strI.equalsIgnoreCase("Expires")) {
                    dateA = ae3.a(strK);
                } else if (strI.equalsIgnoreCase("Last-Modified")) {
                    dateA2 = ae3.a(strK);
                    str2 = strK;
                } else if (strI.equalsIgnoreCase("ETag")) {
                    str = strK;
                } else if (strI.equalsIgnoreCase("Age")) {
                    iO = ieg.o(-1, strK);
                }
            }
            i = iO;
        } else {
            i = -1;
            j = 0;
            time = 0;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i7 = 14;
        if (rybVar == null) {
            a90Var = new a90(i7, btbVar3, (Object) null);
        } else {
            ct6 ct6Var3 = btbVar3.a;
            si6 si6Var4 = btbVar3.c;
            if (ct6Var3.f() && rybVar.e == null) {
                a90Var = new a90(14, btbVar3, (Object) null);
            } else {
                Object obj = null;
                int i8 = 14;
                if (vfh.B(rybVar, btbVar3)) {
                    c81 c81VarK = btbVar3.f;
                    if (c81VarK == null) {
                        int i9 = c81.n;
                        c81VarK = rxg.K(btbVar3.c);
                        btbVar3.f = c81VarK;
                    }
                    if (!c81VarK.a && si6Var4.c("If-Modified-Since") == null && si6Var4.c("If-None-Match") == null) {
                        c81 c81VarB = rybVar.b();
                        long jMax = dateA3 != null ? Math.max(0L, time - dateA3.getTime()) : 0L;
                        if (i != -1) {
                            jMax = Math.max(jMax, timeUnit.toMillis(i));
                        }
                        long jMax2 = jMax + Math.max(0L, time - j) + Math.max(0L, jCurrentTimeMillis - time);
                        int i10 = rybVar.b().c;
                        if (i10 != -1) {
                            time2 = timeUnit.toMillis(i10);
                        } else {
                            if (dateA != null) {
                                if (dateA3 != null) {
                                    time = dateA3.getTime();
                                }
                                time2 = dateA.getTime() - time;
                                if (time2 <= 0) {
                                    time2 = 0;
                                }
                            } else if (dateA2 == null) {
                                j2 = 0;
                                time2 = j2;
                            } else {
                                List list = rybVar.a.a.g;
                                if (list == null) {
                                    string = null;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    k99.M(sb, list);
                                    string = sb.toString();
                                }
                                if (string == null) {
                                    long time3 = (dateA3 != null ? dateA3.getTime() : j) - dateA2.getTime();
                                    j2 = 0;
                                    if (time3 > 0) {
                                        time2 = time3 / 10;
                                    }
                                } else {
                                    j2 = 0;
                                }
                                time2 = j2;
                            }
                            i2 = c81VarK.c;
                            if (i2 != -1) {
                                time2 = Math.min(time2, timeUnit.toMillis(i2));
                            }
                            i3 = c81VarK.i;
                            if (i3 != -1) {
                                millis = timeUnit.toMillis(i3);
                            } else {
                                millis = j2;
                            }
                            if (!c81VarB.g || (i4 = c81VarK.h) == -1) {
                                millis2 = j2;
                            } else {
                                millis2 = timeUnit.toMillis(i4);
                            }
                            if (c81VarB.a) {
                                if (str != null) {
                                    str5 = "If-None-Match";
                                    str4 = str;
                                } else {
                                    if (dateA2 != null) {
                                        str4 = str2;
                                    } else if (dateA3 != null) {
                                        str4 = str3;
                                    } else {
                                        a90Var = new a90(14, btbVar3, (Object) null);
                                    }
                                    str5 = "If-Modified-Since";
                                }
                                qi6 qi6VarJ2 = xdc.j(si6Var4);
                                str4.getClass();
                                xdc.g(qi6VarJ2, str5, str4);
                                zsb zsbVarA = btbVar3.a();
                                zsbVarA.c = xdc.j(xdc.h(qi6VarJ2));
                                a90Var = new a90(14, new btb(zsbVarA), rybVar);
                            } else {
                                j3 = jMax2 + millis;
                                if (j3 < millis2 + time2) {
                                    pybVarH = rybVar.h();
                                    if (j3 >= time2) {
                                        pybVarH.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (jMax2 > 86400000 && rybVar.b().c == -1 && dateA == null) {
                                        pybVarH.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    a90Var = new a90(14, (Object) null, pybVarH.a());
                                } else {
                                    if (str != null) {
                                        str5 = "If-None-Match";
                                        str4 = str;
                                    } else {
                                        if (dateA2 != null) {
                                            str4 = str2;
                                        } else if (dateA3 != null) {
                                            str4 = str3;
                                        } else {
                                            a90Var = new a90(14, btbVar3, (Object) null);
                                        }
                                        str5 = "If-Modified-Since";
                                    }
                                    qi6 qi6VarJ3 = xdc.j(si6Var4);
                                    str4.getClass();
                                    xdc.g(qi6VarJ3, str5, str4);
                                    zsb zsbVarA2 = btbVar3.a();
                                    zsbVarA2.c = xdc.j(xdc.h(qi6VarJ3));
                                    a90Var = new a90(14, new btb(zsbVarA2), rybVar);
                                }
                            }
                        }
                        j2 = 0;
                        i2 = c81VarK.c;
                        if (i2 != -1) {
                            time2 = Math.min(time2, timeUnit.toMillis(i2));
                        }
                        i3 = c81VarK.i;
                        if (i3 != -1) {
                            millis = timeUnit.toMillis(i3);
                        } else {
                            millis = j2;
                        }
                        if (c81VarB.g) {
                            millis2 = j2;
                        } else {
                            millis2 = j2;
                        }
                        if (c81VarB.a) {
                            j3 = jMax2 + millis;
                            if (j3 < millis2 + time2) {
                                pybVarH = rybVar.h();
                                if (j3 >= time2) {
                                    pybVarH.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (jMax2 > 86400000) {
                                    pybVarH.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                a90Var = new a90(14, (Object) null, pybVarH.a());
                            } else {
                                if (str != null) {
                                    str5 = "If-None-Match";
                                    str4 = str;
                                } else {
                                    if (dateA2 != null) {
                                        str4 = str2;
                                    } else if (dateA3 != null) {
                                        str4 = str3;
                                    } else {
                                        a90Var = new a90(14, btbVar3, (Object) null);
                                    }
                                    str5 = "If-Modified-Since";
                                }
                                qi6 qi6VarJ4 = xdc.j(si6Var4);
                                str4.getClass();
                                xdc.g(qi6VarJ4, str5, str4);
                                zsb zsbVarA3 = btbVar3.a();
                                zsbVarA3.c = xdc.j(xdc.h(qi6VarJ4));
                                a90Var = new a90(14, new btb(zsbVarA3), rybVar);
                            }
                        } else {
                            if (str != null) {
                                str5 = "If-None-Match";
                                str4 = str;
                            } else {
                                if (dateA2 != null) {
                                    str4 = str2;
                                } else if (dateA3 != null) {
                                    str4 = str3;
                                } else {
                                    a90Var = new a90(14, btbVar3, (Object) null);
                                }
                                str5 = "If-Modified-Since";
                            }
                            qi6 qi6VarJ5 = xdc.j(si6Var4);
                            str4.getClass();
                            xdc.g(qi6VarJ5, str5, str4);
                            zsb zsbVarA4 = btbVar3.a();
                            zsbVarA4.c = xdc.j(xdc.h(qi6VarJ5));
                            a90Var = new a90(14, new btb(zsbVarA4), rybVar);
                        }
                    } else {
                        a90Var = new a90(14, btbVar3, (Object) null);
                    }
                } else {
                    a90Var = new a90(i8, btbVar3, obj);
                }
            }
        }
        if (((btb) a90Var.b) == null) {
            rybVar2 = null;
        } else {
            c81 c81VarK2 = btbVar3.f;
            if (c81VarK2 == null) {
                int i11 = c81.n;
                c81VarK2 = rxg.K(btbVar3.c);
                btbVar3.f = c81VarK2;
            }
            if (c81VarK2.j) {
                rybVar2 = null;
                a90Var = new a90(14, rybVar2, rybVar2);
            } else {
                rybVar2 = null;
            }
        }
        btb btbVar4 = (btb) a90Var.b;
        ryb rybVar3 = (ryb) a90Var.c;
        if (a81Var != null) {
            synchronized (a81Var) {
            }
        }
        if (rybVar != null && rybVar3 == null) {
            ieg.b(rybVar.g);
        }
        if (btbVar4 == null && rybVar3 == null) {
            tyb tybVar2 = vyb.b;
            g3e g3eVar2 = g2f.d0;
            ArrayList arrayList = new ArrayList(20);
            btb btbVar5 = oibVar.e;
            btbVar5.getClass();
            ryb rybVar4 = new ryb(btbVar5, a1b.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new si6((String[]) arrayList.toArray(new String[0])), tybVar2, null, null, null, null, -1L, System.currentTimeMillis(), null, g3eVar2);
            oibVar.a.d.getClass();
            return rybVar4;
        }
        if (btbVar4 == null) {
            rybVar3.getClass();
            pyb pybVarH2 = rybVar3.h();
            ryb rybVarN = gdc.n(rybVar3);
            pyb.b("cacheResponse", rybVarN);
            pybVarH2.j = rybVarN;
            ryb rybVarA = pybVarH2.a();
            oibVar.a.d.getClass();
            return rybVarA;
        }
        if (rybVar3 != null || a81Var != null) {
            oibVar.a.d.getClass();
        }
        try {
            ryb rybVarB = oibVar.b(btbVar4);
            if (rybVar3 != null) {
                if (rybVarB.d == 304) {
                    pyb pybVarH3 = rybVar3.h();
                    si6 si6Var5 = rybVar3.f;
                    si6 si6Var6 = rybVarB.f;
                    ArrayList arrayList2 = new ArrayList(20);
                    int size2 = si6Var5.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        String strI2 = xdc.i(si6Var5, i12);
                        String strK2 = xdc.k(si6Var5, i12);
                        if ((!"Warning".equalsIgnoreCase(strI2) || !c5e.C(strK2, "1", false)) && ("Content-Length".equalsIgnoreCase(strI2) || "Content-Encoding".equalsIgnoreCase(strI2) || "Content-Type".equalsIgnoreCase(strI2) || !i7h.w(strI2) || si6Var6.c(strI2) == null)) {
                            arrayList2.add(strI2);
                            arrayList2.add(v4e.o0(strK2).toString());
                        }
                    }
                    int size3 = si6Var6.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        String strI3 = xdc.i(si6Var6, i13);
                        if (!"Content-Length".equalsIgnoreCase(strI3) && !"Content-Encoding".equalsIgnoreCase(strI3) && !"Content-Type".equalsIgnoreCase(strI3) && i7h.w(strI3)) {
                            String strK3 = xdc.k(si6Var6, i13);
                            arrayList2.add(strI3);
                            arrayList2.add(v4e.o0(strK3).toString());
                        }
                    }
                    pybVarH3.f = xdc.j(new si6((String[]) arrayList2.toArray(new String[0])));
                    pybVarH3.l = rybVarB.z;
                    pybVarH3.m = rybVarB.X;
                    ryb rybVarN2 = gdc.n(rybVar3);
                    pyb.b("cacheResponse", rybVarN2);
                    pybVarH3.j = rybVarN2;
                    ryb rybVarN3 = gdc.n(rybVarB);
                    pyb.b("networkResponse", rybVarN3);
                    pybVarH3.i = rybVarN3;
                    ryb rybVarA2 = pybVarH3.a();
                    rybVarB.g.close();
                    a81Var.getClass();
                    synchronized (a81Var) {
                    }
                    y71 y71Var2 = new y71(rybVarA2);
                    vyb vybVar = rybVar3.g;
                    vybVar.getClass();
                    q94 q94Var = ((x71) vybVar).c;
                    try {
                        zi0VarL2 = q94Var.d.l(q94Var.b, q94Var.a);
                        if (zi0VarL2 != 0) {
                            try {
                                y71Var2.c(zi0VarL2);
                                zi0VarL2.g();
                            } catch (IOException unused3) {
                                if (zi0VarL2 != 0) {
                                    try {
                                        zi0VarL2.a();
                                    } catch (IOException unused4) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused5) {
                        zi0VarL2 = rybVar2;
                    }
                    oibVar.a.d.getClass();
                    return rybVarA2;
                }
                ieg.b(rybVar3.g);
            }
            pyb pybVarH4 = rybVarB.h();
            ryb rybVarN4 = rybVar3 != null ? gdc.n(rybVar3) : rybVar2;
            pyb.b("cacheResponse", rybVarN4);
            pybVarH4.j = rybVarN4;
            ryb rybVarN5 = gdc.n(rybVarB);
            pyb.b("networkResponse", rybVarN5);
            pybVarH4.i = rybVarN5;
            ryb rybVarA3 = pybVarH4.a();
            if (a81Var != null) {
                if (ss6.a(rybVarA3) && vfh.B(rybVarA3, btbVar4)) {
                    pyb pybVarH5 = rybVarA3.h();
                    pybVarH5.a = btbVar4;
                    ryb rybVarA4 = pybVarH5.a();
                    btb btbVar6 = rybVarA4.a;
                    String str10 = btbVar6.b;
                    try {
                        if (!ym8.B(str10)) {
                            if (str10.equals("GET") && !urg.S(rybVarA4.f).contains("*")) {
                                y71 y71Var3 = new y71(rybVarA4);
                                try {
                                    w94 w94Var = a81Var.a;
                                    String strG = urg.G(btbVar6.a);
                                    rob robVar = w94.I0;
                                    zi0VarL = w94Var.l(-1L, strG);
                                    if (zi0VarL == 0) {
                                        kvVar = rybVar2;
                                    } else {
                                        try {
                                            y71Var3.c(zi0VarL);
                                            kv kvVar2 = new kv();
                                            kvVar2.e = a81Var;
                                            kvVar2.b = zi0VarL;
                                            wkd wkdVarT = zi0VarL.t(1);
                                            kvVar2.c = wkdVarT;
                                            kvVar2.d = new z71(a81Var, kvVar2, wkdVarT);
                                            kvVar = kvVar2;
                                        } catch (IOException unused6) {
                                            if (zi0VarL != 0) {
                                                zi0VarL.a();
                                            }
                                            kvVar = rybVar2;
                                        }
                                    }
                                } catch (IOException unused7) {
                                    zi0VarL = rybVar2;
                                }
                            } else {
                                kvVar = rybVar2;
                            }
                            if (kvVar != 0) {
                                k81 k81Var = new k81(rybVarA3.g.P0(), kvVar, bzd.n((z71) kvVar.d));
                                strC = rybVarA3.f.c("Content-Type");
                                if (strC == null) {
                                    str6 = rybVar2;
                                } else {
                                    str6 = strC;
                                }
                                long jH = rybVarA3.g.h();
                                pyb pybVarH6 = rybVarA3.h();
                                pybVarH6.g = new rib(str6, jH, new yhb(k81Var));
                                rybVarA3 = pybVarH6.a();
                            }
                            if (rybVar3 != null) {
                                oibVar.a.d.getClass();
                            }
                            return rybVarA3;
                        }
                        a81Var.b(btbVar6);
                    } catch (IOException unused8) {
                    }
                    kvVar = rybVar2;
                    if (kvVar != 0) {
                        k81 k81Var2 = new k81(rybVarA3.g.P0(), kvVar, bzd.n((z71) kvVar.d));
                        strC = rybVarA3.f.c("Content-Type");
                        if (strC == null) {
                            str6 = rybVar2;
                        } else {
                            str6 = strC;
                        }
                        long jH2 = rybVarA3.g.h();
                        pyb pybVarH7 = rybVarA3.h();
                        pybVarH7.g = new rib(str6, jH2, new yhb(k81Var2));
                        rybVarA3 = pybVarH7.a();
                    }
                    if (rybVar3 != null) {
                        oibVar.a.d.getClass();
                    }
                    return rybVarA3;
                }
                if (ym8.B(btbVar4.b)) {
                    try {
                        a81Var.b(btbVar4);
                    } catch (IOException unused9) {
                    }
                }
            }
            return rybVarA3;
        } catch (Throwable th) {
            if (rybVar != null) {
                ieg.b(rybVar.g);
            }
            throw th;
        }
    }

    public static boolean d(IOException iOException, cib cibVar, oib oibVar, btb btbVar) {
        ftb ftbVar;
        boolean z = iOException instanceof fk2;
        if (!oibVar.r) {
            return false;
        }
        if ((!z && (((ftbVar = btbVar.d) != null && ftbVar.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        zi0 zi0Var = cibVar.G0;
        if (zi0Var == null || !zi0Var.a) {
            return false;
        }
        v25 v25Var = cibVar.v;
        v25Var.getClass();
        sib sibVarD = v25Var.d();
        zi0 zi0Var2 = cibVar.G0;
        return sibVarD.a(zi0Var2 != null ? zi0Var2.o() : null);
    }

    public static int e(ryb rybVar, int i) {
        String strC = rybVar.f.c("Retry-After");
        if (strC == null) {
            strC = null;
        }
        if (strC == null) {
            return i;
        }
        if (!new rob("\\d+").g(strC)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strC);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:182:0x0377  */
    /* JADX WARN: Code duplicated, block: B:345:0x06be  */
    /* JADX WARN: Code duplicated, block: B:349:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:352:0x06d3 A[Catch: IOException -> 0x06df, TryCatch #18 {IOException -> 0x06df, blocks: (B:350:0x06ca, B:352:0x06d3, B:355:0x06e2, B:364:0x0709, B:366:0x0712, B:367:0x071b, B:368:0x0734, B:373:0x0748, B:379:0x0757, B:380:0x075e, B:382:0x0761, B:385:0x076a, B:391:0x0777, B:393:0x07b0, B:395:0x07c1, B:398:0x07ca, B:405:0x07e3, B:408:0x07f0, B:409:0x0814, B:400:0x07d0, B:392:0x0799), top: B:446:0x06ca }] */
    /* JADX WARN: Code duplicated, block: B:366:0x0712 A[Catch: IOException -> 0x06df, TryCatch #18 {IOException -> 0x06df, blocks: (B:350:0x06ca, B:352:0x06d3, B:355:0x06e2, B:364:0x0709, B:366:0x0712, B:367:0x071b, B:368:0x0734, B:373:0x0748, B:379:0x0757, B:380:0x075e, B:382:0x0761, B:385:0x076a, B:391:0x0777, B:393:0x07b0, B:395:0x07c1, B:398:0x07ca, B:405:0x07e3, B:408:0x07f0, B:409:0x0814, B:400:0x07d0, B:392:0x0799), top: B:446:0x06ca }] */
    /* JADX WARN: Code duplicated, block: B:370:0x0742  */
    /* JADX WARN: Code duplicated, block: B:371:0x0745  */
    /* JADX WARN: Code duplicated, block: B:373:0x0748 A[Catch: IOException -> 0x06df, TryCatch #18 {IOException -> 0x06df, blocks: (B:350:0x06ca, B:352:0x06d3, B:355:0x06e2, B:364:0x0709, B:366:0x0712, B:367:0x071b, B:368:0x0734, B:373:0x0748, B:379:0x0757, B:380:0x075e, B:382:0x0761, B:385:0x076a, B:391:0x0777, B:393:0x07b0, B:395:0x07c1, B:398:0x07ca, B:405:0x07e3, B:408:0x07f0, B:409:0x0814, B:400:0x07d0, B:392:0x0799), top: B:446:0x06ca }] */
    /* JADX WARN: Code duplicated, block: B:375:0x0750  */
    /* JADX WARN: Code duplicated, block: B:376:0x0753  */
    /* JADX WARN: Code duplicated, block: B:378:0x0756  */
    /* JADX WARN: Code duplicated, block: B:379:0x0757 A[Catch: IOException -> 0x06df, TryCatch #18 {IOException -> 0x06df, blocks: (B:350:0x06ca, B:352:0x06d3, B:355:0x06e2, B:364:0x0709, B:366:0x0712, B:367:0x071b, B:368:0x0734, B:373:0x0748, B:379:0x0757, B:380:0x075e, B:382:0x0761, B:385:0x076a, B:391:0x0777, B:393:0x07b0, B:395:0x07c1, B:398:0x07ca, B:405:0x07e3, B:408:0x07f0, B:409:0x0814, B:400:0x07d0, B:392:0x0799), top: B:446:0x06ca }] */
    /* JADX WARN: Code duplicated, block: B:382:0x0761 A[Catch: IOException -> 0x06df, TryCatch #18 {IOException -> 0x06df, blocks: (B:350:0x06ca, B:352:0x06d3, B:355:0x06e2, B:364:0x0709, B:366:0x0712, B:367:0x071b, B:368:0x0734, B:373:0x0748, B:379:0x0757, B:380:0x075e, B:382:0x0761, B:385:0x076a, B:391:0x0777, B:393:0x07b0, B:395:0x07c1, B:398:0x07ca, B:405:0x07e3, B:408:0x07f0, B:409:0x0814, B:400:0x07d0, B:392:0x0799), top: B:446:0x06ca }] */
    /* JADX WARN: Code duplicated, block: B:384:0x0769  */
    /* JADX WARN: Code duplicated, block: B:387:0x0770  */
    /* JADX WARN: Code duplicated, block: B:388:0x0771  */
    /* JADX WARN: Code duplicated, block: B:392:0x0799 A[Catch: IOException -> 0x06df, TryCatch #18 {IOException -> 0x06df, blocks: (B:350:0x06ca, B:352:0x06d3, B:355:0x06e2, B:364:0x0709, B:366:0x0712, B:367:0x071b, B:368:0x0734, B:373:0x0748, B:379:0x0757, B:380:0x075e, B:382:0x0761, B:385:0x076a, B:391:0x0777, B:393:0x07b0, B:395:0x07c1, B:398:0x07ca, B:405:0x07e3, B:408:0x07f0, B:409:0x0814, B:400:0x07d0, B:392:0x0799), top: B:446:0x06ca }] */
    /* JADX WARN: Code duplicated, block: B:395:0x07c1 A[Catch: IOException -> 0x06df, TryCatch #18 {IOException -> 0x06df, blocks: (B:350:0x06ca, B:352:0x06d3, B:355:0x06e2, B:364:0x0709, B:366:0x0712, B:367:0x071b, B:368:0x0734, B:373:0x0748, B:379:0x0757, B:380:0x075e, B:382:0x0761, B:385:0x076a, B:391:0x0777, B:393:0x07b0, B:395:0x07c1, B:398:0x07ca, B:405:0x07e3, B:408:0x07f0, B:409:0x0814, B:400:0x07d0, B:392:0x0799), top: B:446:0x06ca }] */
    /* JADX WARN: Code duplicated, block: B:397:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:400:0x07d0 A[Catch: IOException -> 0x06df, TryCatch #18 {IOException -> 0x06df, blocks: (B:350:0x06ca, B:352:0x06d3, B:355:0x06e2, B:364:0x0709, B:366:0x0712, B:367:0x071b, B:368:0x0734, B:373:0x0748, B:379:0x0757, B:380:0x075e, B:382:0x0761, B:385:0x076a, B:391:0x0777, B:393:0x07b0, B:395:0x07c1, B:398:0x07ca, B:405:0x07e3, B:408:0x07f0, B:409:0x0814, B:400:0x07d0, B:392:0x0799), top: B:446:0x06ca }] */
    /* JADX WARN: Code duplicated, block: B:415:0x081d A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:481:0x071b A[SYNTHETIC] */
    @Override // defpackage.i87
    public final ryb a(oib oibVar) throws Throwable {
        pyb pybVarW;
        boolean z;
        boolean z2;
        IOException iOException;
        pyb pybVarW2;
        ryb rybVarA;
        int i;
        boolean z3;
        ryb rybVarA2;
        btb btbVar;
        String strC;
        String strC2;
        boolean z4;
        boolean z5;
        pyb pybVar;
        Object vr6Var;
        boolean z6;
        String str;
        Object dzbVar;
        List listI;
        List list;
        String strConcat;
        List list2;
        ryb rybVar;
        boolean z7;
        boolean z8;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        rv1 rv1Var;
        String str2;
        switch (this.a) {
            case 0:
                zi0 zi0Var = oibVar.d;
                zi0Var.getClass();
                btb btbVar2 = oibVar.e;
                ftb ftbVar = btbVar2.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z9 = ym8.E(btbVar2.b) && ftbVar != null;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(btbVar2.c.c("Connection"));
                try {
                    try {
                        ((cib) zi0Var.b).d.getClass();
                        ((u25) zi0Var.d).b(btbVar2);
                        ((cib) zi0Var.b).d.getClass();
                        if (z9) {
                            try {
                                if ("100-continue".equalsIgnoreCase(btbVar2.c.c("Expect"))) {
                                    try {
                                        try {
                                            ((u25) zi0Var.d).h();
                                            z5 = true;
                                            pybVarW = zi0Var.w(true);
                                            try {
                                                ((cib) zi0Var.b).d.getClass();
                                                pybVar = pybVarW;
                                                z = false;
                                            } catch (IOException e) {
                                                e = e;
                                                z = true;
                                                z2 = true;
                                                if (e instanceof fk2) {
                                                    throw e;
                                                }
                                                throw e;
                                            }
                                        } catch (IOException e2) {
                                            ((cib) zi0Var.b).d.getClass();
                                            zi0Var.A(e2);
                                            throw e2;
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        pybVarW = null;
                                    }
                                } else {
                                    z5 = true;
                                    pybVar = null;
                                    z = true;
                                }
                                if (pybVar != null) {
                                    try {
                                        z2 = z5;
                                        try {
                                            ((cib) zi0Var.b).f(zi0Var, true, false, false, false, null);
                                            if (!(zi0Var.o().i != null ? z2 : false)) {
                                                ((u25) zi0Var.d).j().e();
                                            }
                                        } catch (IOException e4) {
                                            e = e4;
                                            pybVarW = pybVar;
                                            if (e instanceof fk2) {
                                                throw e;
                                            }
                                            throw e;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        z2 = z5;
                                        pybVarW = pybVar;
                                        if (e instanceof fk2) {
                                            throw e;
                                        }
                                        throw e;
                                    }
                                    break;
                                } else {
                                    try {
                                        ftbVar.getClass();
                                        ftb ftbVar2 = btbVar2.d;
                                        ftbVar2.getClass();
                                        long jA = ftbVar2.a();
                                        ((cib) zi0Var.b).d.getClass();
                                        xhb xhbVar = new xhb(new r25(zi0Var, ((u25) zi0Var.d).f(btbVar2, jA), jA, false));
                                        ftbVar.d(xhbVar);
                                        xhbVar.close();
                                        z2 = z5;
                                    } catch (IOException e6) {
                                        e = e6;
                                        z2 = z5;
                                        pybVarW = pybVar;
                                        if (e instanceof fk2) {
                                            throw e;
                                        }
                                        throw e;
                                    }
                                }
                                pybVarW = pybVar;
                            } catch (IOException e7) {
                                e = e7;
                                z2 = true;
                                pybVarW = null;
                                z = true;
                                if ((e instanceof fk2) || !zi0Var.a) {
                                    throw e;
                                }
                                pyb pybVar2 = pybVarW;
                                iOException = e;
                                pybVarW2 = pybVar2;
                                if (pybVarW2 == null) {
                                    try {
                                        pybVarW2 = zi0Var.w(false);
                                        pybVarW2.getClass();
                                        if (z) {
                                            ((cib) zi0Var.b).d.getClass();
                                            z = false;
                                        }
                                    } catch (IOException e8) {
                                        if (iOException == null) {
                                            throw e8;
                                        }
                                        bzd.m(iOException, e8);
                                        throw iOException;
                                    }
                                }
                                pybVarW2.a = btbVar2;
                                pybVarW2.e = zi0Var.o().f;
                                pybVarW2.l = jCurrentTimeMillis;
                                pybVarW2.m = System.currentTimeMillis();
                                rybVarA = pybVarW2.a();
                                i = rybVarA.d;
                                while (true) {
                                    if (i != 100) {
                                        ((cib) zi0Var.b).d.getClass();
                                        if (i == 101) {
                                            z3 = z2;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            if (zi0Var.o().i != null) {
                                                z4 = z2;
                                            } else {
                                                z4 = false;
                                            }
                                            if (!z4) {
                                                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                            }
                                        }
                                        if (z3) {
                                            strC2 = rybVarA.f.c("Connection");
                                            if (strC2 == null) {
                                                strC2 = null;
                                            }
                                            if ("upgrade".equalsIgnoreCase(strC2)) {
                                                z2 = false;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                        if (zEqualsIgnoreCase) {
                                            rib ribVarU = zi0Var.u(rybVarA);
                                            pyb pybVarH = rybVarA.h();
                                            pybVarH.g = ribVarU;
                                            pybVarH.o = new i8c(16);
                                            rybVarA2 = pybVarH.a();
                                        } else {
                                            rib ribVarU2 = zi0Var.u(rybVarA);
                                            pyb pybVarH2 = rybVarA.h();
                                            pybVarH2.g = ribVarU2;
                                            pybVarH2.o = new i8c(16);
                                            rybVarA2 = pybVarH2.a();
                                        }
                                        btbVar = rybVarA2.a;
                                        btbVar.getClass();
                                        if ("close".equalsIgnoreCase(btbVar.c.c("Connection"))) {
                                            ((u25) zi0Var.d).j().e();
                                        } else {
                                            strC = rybVarA2.f.c("Connection");
                                            if (strC == null) {
                                                strC = null;
                                            }
                                            if ("close".equalsIgnoreCase(strC)) {
                                                ((u25) zi0Var.d).j().e();
                                            }
                                        }
                                        if (i == 204) {
                                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + rybVarA2.g.h());
                                        }
                                        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + rybVarA2.g.h());
                                        return rybVarA2;
                                    }
                                    pyb pybVarW3 = zi0Var.w(false);
                                    pybVarW3.getClass();
                                    if (z) {
                                        ((cib) zi0Var.b).d.getClass();
                                    }
                                    pybVarW3.a = btbVar2;
                                    pybVarW3.e = zi0Var.o().f;
                                    pybVarW3.l = jCurrentTimeMillis;
                                    pybVarW3.m = System.currentTimeMillis();
                                    rybVarA = pybVarW3.a();
                                    i = rybVarA.d;
                                }
                            }
                        } else {
                            z2 = true;
                            ((cib) zi0Var.b).f(zi0Var, true, false, false, false, null);
                            pybVarW = null;
                            z = true;
                        }
                        try {
                            ((u25) zi0Var.d).c();
                            pybVarW2 = pybVarW;
                            iOException = null;
                            if (pybVarW2 == null) {
                                pybVarW2 = zi0Var.w(false);
                                pybVarW2.getClass();
                                if (z) {
                                    ((cib) zi0Var.b).d.getClass();
                                    z = false;
                                }
                            }
                            pybVarW2.a = btbVar2;
                            pybVarW2.e = zi0Var.o().f;
                            pybVarW2.l = jCurrentTimeMillis;
                            pybVarW2.m = System.currentTimeMillis();
                            rybVarA = pybVarW2.a();
                            i = rybVarA.d;
                            while (true) {
                                if (i != 100 && (102 > i || i >= 200)) {
                                }
                                pyb pybVarW4 = zi0Var.w(false);
                                pybVarW4.getClass();
                                if (z) {
                                    ((cib) zi0Var.b).d.getClass();
                                }
                                pybVarW4.a = btbVar2;
                                pybVarW4.e = zi0Var.o().f;
                                pybVarW4.l = jCurrentTimeMillis;
                                pybVarW4.m = System.currentTimeMillis();
                                rybVarA = pybVarW4.a();
                                i = rybVarA.d;
                            }
                            ((cib) zi0Var.b).d.getClass();
                            if (i == 101) {
                                z3 = z2;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                if (zi0Var.o().i != null) {
                                    z4 = z2;
                                } else {
                                    z4 = false;
                                }
                                if (!z4) {
                                    throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                }
                            }
                            if (z3) {
                                z2 = false;
                            } else {
                                strC2 = rybVarA.f.c("Connection");
                                if (strC2 == null) {
                                    strC2 = null;
                                }
                                if ("upgrade".equalsIgnoreCase(strC2)) {
                                    z2 = false;
                                }
                            }
                            if (zEqualsIgnoreCase || !z2) {
                                rib ribVarU3 = zi0Var.u(rybVarA);
                                pyb pybVarH3 = rybVarA.h();
                                pybVarH3.g = ribVarU3;
                                pybVarH3.o = new i8c(16);
                                rybVarA2 = pybVarH3.a();
                            } else {
                                pyb pybVarH4 = rybVarA.h();
                                pybVarH4.g = new qff(rybVarA.g.l(), rybVarA.g.h());
                                pybVarH4.h = zi0Var.B();
                                rybVarA2 = pybVarH4.a();
                            }
                            btbVar = rybVarA2.a;
                            btbVar.getClass();
                            if ("close".equalsIgnoreCase(btbVar.c.c("Connection"))) {
                                ((u25) zi0Var.d).j().e();
                            } else {
                                strC = rybVarA2.f.c("Connection");
                                if (strC == null) {
                                    strC = null;
                                }
                                if ("close".equalsIgnoreCase(strC)) {
                                    ((u25) zi0Var.d).j().e();
                                }
                            }
                            if ((i == 204 && i != 205) || rybVarA2.g.h() <= 0) {
                                return rybVarA2;
                            }
                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + rybVarA2.g.h());
                        } catch (IOException e9) {
                            try {
                                ((cib) zi0Var.b).d.getClass();
                                zi0Var.A(e9);
                                throw e9;
                            } catch (IOException e10) {
                                e = e10;
                                if (e instanceof fk2) {
                                    throw e;
                                }
                                throw e;
                            }
                        }
                    } catch (IOException e11) {
                        ((cib) zi0Var.b).d.getClass();
                        zi0Var.A(e11);
                        throw e11;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
                break;
            case 1:
                cib cibVar = oibVar.a;
                synchronized (cibVar) {
                    if (!cibVar.E0) {
                        throw new IllegalStateException("released");
                    }
                    if (cibVar.X || cibVar.z || cibVar.Z || cibVar.Y) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                v25 v25Var = cibVar.v;
                v25Var.getClass();
                dib dibVarC = v25Var.c();
                hm9 hm9Var = cibVar.a;
                dibVarC.getClass();
                hm9Var.getClass();
                int i2 = oibVar.g;
                ta0 ta0Var = dibVarC.h;
                ds6 ds6Var = dibVarC.i;
                if (ds6Var != null) {
                    vr6Var = new es6(hm9Var, dibVarC, oibVar, ds6Var);
                } else {
                    dibVarC.e.setSoTimeout(i2);
                    ((yhb) ta0Var.d).a.j().g(i2);
                    ((xhb) ta0Var.b).a.j().g(oibVar.h);
                    vr6Var = new vr6(hm9Var, dibVarC, ta0Var);
                }
                v25Var.getClass();
                zi0 zi0Var2 = new zi0();
                zi0Var2.b = cibVar;
                zi0Var2.c = v25Var;
                zi0Var2.d = vr6Var;
                cibVar.y = zi0Var2;
                cibVar.G0 = zi0Var2;
                synchronized (cibVar) {
                    cibVar.z = true;
                    cibVar.X = true;
                }
                if (!cibVar.F0) {
                    return oib.a(oibVar, 0, zi0Var2, null, 2097149).b(oibVar.e);
                }
                yg5.m("Canceled");
                return null;
            case 2:
                fu2 fu2Var = oibVar.m;
                btb btbVar3 = oibVar.e;
                zsb zsbVarA = btbVar3.a();
                ct6 ct6Var = btbVar3.a;
                si6 si6Var = btbVar3.c;
                ftb ftbVar3 = btbVar3.d;
                if (ftbVar3 != null) {
                    oq8 oq8VarB = ftbVar3.b();
                    if (oq8VarB != null) {
                        zsbVarA.a("Content-Type", oq8VarB.a);
                    }
                    long jA2 = ftbVar3.a();
                    if (jA2 != -1) {
                        zsbVarA.a("Content-Length", String.valueOf(jA2));
                        zsbVarA.c.f("Transfer-Encoding");
                    } else {
                        zsbVarA.a("Transfer-Encoding", "chunked");
                        zsbVarA.c.f("Content-Length");
                    }
                }
                if (si6Var.c("Host") == null) {
                    zsbVarA.a("Host", keg.i(ct6Var, false));
                }
                if (si6Var.c("Connection") == null) {
                    zsbVarA.a("Connection", "Keep-Alive");
                }
                if (si6Var.c("Accept-Encoding") == null && si6Var.c("Range") == null) {
                    zsbVarA.a("Accept-Encoding", "gzip");
                    z6 = true;
                } else {
                    z6 = false;
                }
                List listD = fu2Var.d(ct6Var);
                if (!listD.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = 0;
                    for (Object obj : listD) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            t72.Z();
                            throw null;
                        }
                        eu2 eu2Var = (eu2) obj;
                        if (i3 > 0) {
                            sb.append("; ");
                        }
                        sb.append(eu2Var.a);
                        sb.append('=');
                        sb.append(eu2Var.b);
                        i3 = i4;
                    }
                    zsbVarA.a("Cookie", sb.toString());
                }
                if (si6Var.c("User-Agent") == null) {
                    zsbVarA.a("User-Agent", "okhttp/5.4.0");
                }
                btb btbVar4 = new btb(zsbVarA);
                ryb rybVarB = oibVar.b(btbVar4);
                si6 si6Var2 = rybVarB.f;
                ss6.b(fu2Var, btbVar4.a, si6Var2);
                pyb pybVarH5 = rybVarB.h();
                pybVarH5.a = btbVar4;
                if (z6) {
                    String strC3 = si6Var2.c("Content-Encoding");
                    if (strC3 == null) {
                        strC3 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strC3) && ss6.a(rybVarB)) {
                        fg6 fg6Var = new fg6(rybVarB.g.P0());
                        qi6 qi6VarJ = xdc.j(si6Var2);
                        qi6VarJ.f("Content-Encoding");
                        qi6VarJ.f("Content-Length");
                        pybVarH5.f = xdc.j(xdc.h(qi6VarJ));
                        String strC4 = si6Var2.c("Content-Type");
                        pybVarH5.g = new rib(strC4 == null ? null : strC4, -1L, new yhb(fg6Var));
                    }
                }
                return pybVarH5.a();
            case 3:
                return c(oibVar);
            case 4:
                btb btbVar5 = oibVar.e;
                ryb rybVarB2 = oibVar.b(btbVar5);
                if (!rybVarB2.F0) {
                    Set set = ws6.a;
                    zc7 zc7Var = (zc7) btbVar5.b();
                    if (zc7Var != null) {
                        Annotation[] annotations = zc7Var.c.getAnnotations();
                        annotations.getClass();
                        int length = annotations.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                Annotation annotation = annotations[i5];
                                if (annotation instanceof y36) {
                                    strConcat = ((y36) annotation).value();
                                } else if (annotation instanceof iw9) {
                                    strConcat = ((iw9) annotation).value();
                                } else if (annotation instanceof jw9) {
                                    strConcat = ((jw9) annotation).value();
                                } else if (annotation instanceof hw9) {
                                    strConcat = ((hw9) annotation).value();
                                } else if (annotation instanceof k23) {
                                    strConcat = ((k23) annotation).value();
                                } else if (annotation instanceof qg6) {
                                    strConcat = ((qg6) annotation).value();
                                } else if (annotation instanceof kk9) {
                                    strConcat = ((kk9) annotation).value();
                                } else {
                                    strConcat = annotation instanceof rg6 ? ((rg6) annotation).path() : null;
                                }
                                if (strConcat == null) {
                                    i5++;
                                }
                            } else {
                                strConcat = null;
                            }
                        }
                        if (strConcat == null) {
                            str = null;
                        } else {
                            if (v4e.Q(strConcat)) {
                                strConcat = null;
                            }
                            if (strConcat != null) {
                                if (!v4e.e0(strConcat, '/')) {
                                    strConcat = "/".concat(strConcat);
                                }
                                str = strConcat;
                            } else {
                                str = null;
                            }
                        }
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        try {
                            dzbVar = rybVarB2.l().u();
                        } catch (Throwable th) {
                            dzbVar = new dzb(th);
                        }
                        if (dzbVar instanceof dzb) {
                            dzbVar = "";
                        }
                        String str3 = btbVar5.b;
                        int i6 = rybVarB2.d;
                        kzc kzcVarC = nzc.c((String) dzbVar);
                        String strC5 = rybVarB2.f.c("x-trace-id");
                        String str4 = strC5 == null ? null : strC5;
                        zc7 zc7Var2 = (zc7) btbVar5.b();
                        if (zc7Var2 == null || (list = zc7Var2.d) == null) {
                            listI = pu4.a;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (obj2 instanceof LegacyImportRequest) {
                                    arrayList.add(obj2);
                                }
                            }
                            LegacyImportRequest legacyImportRequest = (LegacyImportRequest) s72.x0(arrayList);
                            if (legacyImportRequest != null) {
                                List<TarotReadingHistory> data = legacyImportRequest.getData();
                                ArrayList arrayList2 = new ArrayList(t72.u(data, 10));
                                Iterator<T> it = data.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((TarotReadingHistory) it.next()).getChatId());
                                }
                                listI = t72.I(new iy9("legacy_import_batch_size", String.valueOf(arrayList2.size())), new iy9("legacy_import_chat_ids", v4e.m0(UserMetadata.MAX_ATTRIBUTE_SIZE, s72.D0(arrayList2, ",", null, null, null, 62))));
                            } else {
                                listI = pu4.a;
                            }
                        }
                        vs6 vs6Var = new vs6(str3, str, i6, kzcVarC, str4, listI);
                        if (vs6Var.b()) {
                            try {
                                td5 td5Var = td5.a;
                                td5.b(vs6Var);
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    break;
                }
                return rybVarB2;
            case 5:
                btb btbVar6 = oibVar.e;
                cib cibVar2 = oibVar.a;
                List listR0 = pu4.a;
                ryb rybVar2 = null;
                int i7 = 0;
                btb btbVarB = btbVar6;
                while (true) {
                    boolean z10 = true;
                    while (true) {
                        btbVarB.getClass();
                        if (cibVar2.y != null) {
                            qc0.p("Check failed.");
                            return null;
                        }
                        synchronized (cibVar2) {
                            if (cibVar2.X) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (cibVar2.z || cibVar2.Z || cibVar2.Y) {
                                throw new IllegalStateException("Check failed.");
                            }
                        }
                        if (z10) {
                            hm9 hm9Var2 = cibVar2.a;
                            List list3 = listR0;
                            kle kleVar = hm9Var2.C;
                            ws4 ws4Var = (ws4) oibVar.l.a;
                            int i8 = oibVar.g;
                            int i9 = oibVar.h;
                            int i10 = oibVar.f;
                            boolean z11 = oibVar.r;
                            boolean z12 = hm9Var2.f;
                            ct6 ct6Var2 = btbVarB.a;
                            ct6Var2.getClass();
                            rybVar = null;
                            if (ct6Var2.f()) {
                                SSLSocketFactory sSLSocketFactory2 = oibVar.t;
                                HostnameVerifier hostnameVerifier2 = oibVar.o;
                                rv1Var = oibVar.k;
                                hostnameVerifier = hostnameVerifier2;
                                sSLSocketFactory = sSLSocketFactory2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                rv1Var = null;
                            }
                            String str5 = ct6Var2.d;
                            int i11 = ct6Var2.e;
                            ndb ndbVar = oibVar.n;
                            SocketFactory socketFactory = oibVar.s;
                            ndb ndbVar2 = oibVar.p;
                            hm9 hm9Var3 = oibVar.a.a;
                            list2 = list3;
                            btb btbVar7 = btbVarB;
                            sib sibVar = new sib(kleVar, ws4Var, i8, i9, i10, i8, z11, z12, new hh(str5, i11, ndbVar, socketFactory, sSLSocketFactory, hostnameVerifier, rv1Var, ndbVar2, hm9Var3.s, hm9Var3.r, oibVar.q), cibVar2.a.B, cibVar2, btbVar7);
                            btbVarB = btbVar7;
                            hm9 hm9Var4 = cibVar2.a;
                            cibVar2.v = hm9Var4.f ? new oa5(sibVar, hm9Var4.C) : new g5b(4, sibVar);
                        } else {
                            list2 = listR0;
                            rybVar = null;
                        }
                        try {
                            if (cibVar2.F0) {
                                throw new IOException("Canceled");
                            }
                            try {
                            } catch (IOException e13) {
                                boolean zD = d(e13, cibVar2, oibVar, btbVarB);
                                cibVar2.d.getClass();
                                if (!zD) {
                                    byte[] bArr = ieg.a;
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        bzd.m(e13, (Exception) it2.next());
                                    }
                                    throw e13;
                                }
                                listR0 = s72.R0(list2, e13);
                                cibVar2.d(true);
                                z10 = false;
                            }
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            z7 = true;
                        }
                        cibVar2.d(z7);
                        throw th;
                    }
                    pyb pybVarH6 = oibVar.b(btbVarB).h();
                    pybVarH6.a = btbVarB;
                    pybVarH6.k = rybVar2 != null ? gdc.n(rybVar2) : rybVar;
                    ryb rybVarA3 = pybVarH6.a();
                    btbVarB = b(rybVarA3, cibVar2.y, oibVar);
                    try {
                        if (btbVarB == null) {
                            cibVar2.d.getClass();
                            z8 = false;
                        } else {
                            ftb ftbVar4 = btbVarB.d;
                            if (ftbVar4 == null || !ftbVar4.c()) {
                                ieg.b(rybVarA3.g);
                                int i12 = i7 + 1;
                                tz4 tz4Var = cibVar2.d;
                                if (i12 > 20) {
                                    tz4Var.getClass();
                                    throw new ProtocolException("Too many follow-up requests: " + i12);
                                }
                                tz4Var.getClass();
                                cibVar2.d(true);
                                rybVar2 = rybVarA3;
                                listR0 = list2;
                                i7 = i12;
                            } else {
                                cibVar2.d.getClass();
                                z8 = false;
                            }
                        }
                        cibVar2.d(z8);
                        return rybVarA3;
                    } catch (Throwable th3) {
                        th = th3;
                        z7 = false;
                    }
                }
                break;
            default:
                zsb zsbVarA2 = oibVar.e.a();
                zsbVarA2.a("x-quin-android", "5.23.0");
                String strJ = ub3.j(Build.BRAND, " ", Build.MODEL);
                if (strJ.length() == 0) {
                    str2 = null;
                } else {
                    int length2 = strJ.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length2) {
                            str2 = strJ;
                        } else {
                            char cCharAt = strJ.charAt(i13);
                            if (cCharAt == '\t' || (' ' <= cCharAt && cCharAt < 127)) {
                                i13++;
                            } else {
                                str2 = null;
                            }
                        }
                    }
                }
                if (str2 == null) {
                    str2 = "Android";
                }
                zsbVarA2.a("x-device-model", str2);
                ca2.a.getClass();
                zsbVarA2.a("x-quin-region", ca2.c ? "global" : "cn");
                zsbVarA2.a("x-quin-locale", vd8.d());
                zsbVarA2.a("x-quin-store", ca2.d);
                return oibVar.b(new btb(zsbVarA2));
        }
    }
}
