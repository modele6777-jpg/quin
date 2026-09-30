package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lch extends wbh {
    public long e;
    public long f;

    public static hsg E0(zjg zjgVar) {
        Object obj;
        Bundle bundleF0 = F0(zjgVar.c, true);
        String string = (!bundleF0.containsKey("_o") || (obj = bundleF0.get("_o")) == null) ? "app" : obj.toString();
        String strU = rfc.u(zjgVar.a, ok8.t, ok8.y);
        if (strU == null) {
            strU = zjgVar.a;
        }
        return new hsg(strU, new esg(bundleF0), string, zjgVar.b, 0L);
    }

    public static Bundle F0(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(F0((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void I0(t2h t2hVar, String str, Long l) {
        List listH = t2hVar.h();
        int i = 0;
        while (true) {
            if (i >= listH.size()) {
                i = -1;
                break;
            } else if (str.equals(((e3h) listH.get(i)).s())) {
                break;
            } else {
                i++;
            }
        }
        d3h d3hVarD = e3h.D();
        d3hVarD.h(str);
        d3hVarD.j(l.longValue());
        if (i < 0) {
            t2hVar.l(d3hVarD);
        } else {
            t2hVar.c();
            ((v2h) t2hVar.b).I(i, (e3h) d3hVarD.e());
        }
    }

    public static final Bundle J0(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3h e3hVar = (e3h) it.next();
            String strS = e3hVar.s();
            if (e3hVar.z()) {
                bundle.putDouble(strS, e3hVar.A());
            } else if (e3hVar.x()) {
                bundle.putFloat(strS, e3hVar.y());
            } else if (e3hVar.t()) {
                bundle.putString(strS, e3hVar.u());
            } else if (e3hVar.v()) {
                bundle.putLong(strS, e3hVar.w());
            }
        }
        return bundle;
    }

    public static final e3h K0(String str, v2h v2hVar) {
        for (e3h e3hVar : v2hVar.t()) {
            if (e3hVar.s().equals(str)) {
                return e3hVar;
            }
        }
        return null;
    }

    public static final String L0(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable M0(String str, v2h v2hVar) {
        e3h e3hVarK0 = K0(str, v2hVar);
        if (e3hVarK0 == null) {
            return null;
        }
        return S0(e3hVarK0);
    }

    public static final void P0(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void Q0(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String R0(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable S0(e3h e3hVar) {
        if (e3hVar.t()) {
            return e3hVar.u();
        }
        if (e3hVar.v()) {
            return Long.valueOf(e3hVar.w());
        }
        if (e3hVar.z()) {
            return Double.valueOf(e3hVar.A());
        }
        if (e3hVar.C() > 0) {
            return n1(e3hVar.B());
        }
        return null;
    }

    public static final void T0(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                Q0(builder, str3, string, hashSet);
            }
        }
    }

    public static final void U0(StringBuilder sb, String str, e4h e4hVar) {
        if (e4hVar == null) {
            return;
        }
        P0(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (e4hVar.u() != 0) {
            P0(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : e4hVar.t()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (e4hVar.s() != 0) {
            P0(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : e4hVar.r()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (e4hVar.w() != 0) {
            P0(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (s2h s2hVar : e4hVar.v()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(s2hVar.r() ? Integer.valueOf(s2hVar.s()) : null);
                sb.append(":");
                sb.append(s2hVar.t() ? Long.valueOf(s2hVar.u()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (e4hVar.y() != 0) {
            P0(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (h4h h4hVar : e4hVar.x()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(h4hVar.r() ? Integer.valueOf(h4hVar.s()) : null);
                sb.append(": [");
                Iterator it = h4hVar.t().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        P0(3, sb);
        sb.append("}\n");
    }

    public static final void V0(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        P0(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void W0(StringBuilder sb, int i, String str, qyg qygVar) {
        String str2;
        if (qygVar == null) {
            return;
        }
        P0(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (qygVar.r()) {
            int iB = qygVar.B();
            if (iB == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iB == 2) {
                str2 = "LESS_THAN";
            } else if (iB != 3) {
                str2 = iB != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            V0(sb, i, "comparison_type", str2);
        }
        if (qygVar.s()) {
            V0(sb, i, "match_as_float", Boolean.valueOf(qygVar.t()));
        }
        if (qygVar.u()) {
            V0(sb, i, "comparison_value", qygVar.v());
        }
        if (qygVar.w()) {
            V0(sb, i, "min_comparison_value", qygVar.x());
        }
        if (qygVar.y()) {
            V0(sb, i, "max_comparison_value", qygVar.z());
        }
        P0(i, sb);
        sb.append("}\n");
    }

    public static boolean e1(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean f1(ymg ymgVar, int i) {
        if (i < ((fng) ymgVar).c * 64) {
            return ((1 << (i % 64)) & ((Long) ((fng) ymgVar).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList g1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static mmg l1(mmg mmgVar, byte[] bArr) throws bng {
        hmg hmgVarA = hmg.a();
        if (hmgVarA != null) {
            mmgVar.getClass();
            mmgVar.g(bArr, bArr.length, hmgVarA);
            return mmgVar;
        }
        mmgVar.getClass();
        int length = bArr.length;
        int i = slg.a;
        mmgVar.g(bArr, length, hmg.b);
        return mmgVar;
    }

    public static int m1(String str, u3h u3hVar) {
        for (int i = 0; i < ((z3h) u3hVar.b).Y1(); i++) {
            if (str.equals(((z3h) u3hVar.b).Z1(i).t())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] n1(zmg zmgVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = zmgVar.iterator();
        while (it.hasNext()) {
            e3h e3hVar = (e3h) it.next();
            if (e3hVar != null) {
                Bundle bundle = new Bundle();
                for (e3h e3hVar2 : e3hVar.B()) {
                    if (e3hVar2.t()) {
                        bundle.putString(e3hVar2.s(), e3hVar2.u());
                    } else if (e3hVar2.v()) {
                        bundle.putLong(e3hVar2.s(), e3hVar2.w());
                    } else if (e3hVar2.z()) {
                        bundle.putDouble(e3hVar2.s(), e3hVar2.A());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap o1(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(o1((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(o1((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(o1((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void G0(Map map) {
        long epochMilli;
        w3h w3hVar = (w3h) this.b;
        String strL0 = L0("Date", map);
        if (TextUtils.isEmpty(strL0)) {
            return;
        }
        try {
            epochMilli = ZonedDateTime.parse(strL0, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.x.b(strL0, "Unable to parse header time, time");
            epochMilli = 0;
        }
        if (epochMilli > 0) {
            w3hVar.y.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            A0();
            if (this.f == 0) {
                this.e = jElapsedRealtime;
                this.f = epochMilli;
            }
        }
    }

    public final long H0(long j) {
        A0();
        long j2 = this.f;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.e) + j;
    }

    public final void N0(StringBuilder sb, int i, zmg zmgVar) {
        if (zmgVar == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = zmgVar.iterator();
        while (it.hasNext()) {
            e3h e3hVar = (e3h) it.next();
            if (e3hVar != null) {
                P0(i2, sb);
                sb.append("param {\n");
                V0(sb, i2, "name", e3hVar.r() ? ((w3h) this.b).x.b(e3hVar.s()) : null);
                V0(sb, i2, "string_value", e3hVar.t() ? e3hVar.u() : null);
                V0(sb, i2, "int_value", e3hVar.v() ? Long.valueOf(e3hVar.w()) : null);
                V0(sb, i2, "double_value", e3hVar.z() ? Double.valueOf(e3hVar.A()) : null);
                if (e3hVar.C() > 0) {
                    N0(sb, i2, e3hVar.B());
                }
                P0(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void O0(StringBuilder sb, int i, nyg nygVar) {
        String str;
        if (nygVar == null) {
            return;
        }
        P0(i, sb);
        sb.append("filter {\n");
        if (nygVar.v()) {
            V0(sb, i, "complement", Boolean.valueOf(nygVar.w()));
        }
        if (nygVar.x()) {
            V0(sb, i, "param_name", ((w3h) this.b).x.b(nygVar.y()));
        }
        if (nygVar.r()) {
            int i2 = i + 1;
            wyg wygVarS = nygVar.s();
            if (wygVarS != null) {
                P0(i2, sb);
                sb.append("string_filter {\n");
                if (wygVarS.r()) {
                    switch (wygVarS.z()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    V0(sb, i2, "match_type", str);
                }
                if (wygVarS.s()) {
                    V0(sb, i2, "expression", wygVarS.t());
                }
                if (wygVarS.u()) {
                    V0(sb, i2, "case_sensitive", Boolean.valueOf(wygVarS.v()));
                }
                if (wygVarS.x() > 0) {
                    P0(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : wygVarS.w()) {
                        P0(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                P0(i2, sb);
                sb.append("}\n");
            }
        }
        if (nygVar.t()) {
            W0(sb, i + 1, "number_filter", nygVar.u());
        }
        P0(i, sb);
        sb.append("}\n");
    }

    public final void X0(n4h n4hVar, Object obj) {
        n4hVar.c();
        ((p4h) n4hVar.b).G();
        n4hVar.c();
        ((p4h) n4hVar.b).I();
        n4hVar.c();
        ((p4h) n4hVar.b).K();
        if (obj instanceof String) {
            n4hVar.c();
            ((p4h) n4hVar.b).F((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            n4hVar.c();
            ((p4h) n4hVar.b).H(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            n4hVar.c();
            ((p4h) n4hVar.b).J(dDoubleValue);
        } else {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void Y0(d3h d3hVar, Object obj) {
        d3hVar.c();
        ((e3h) d3hVar.b).G();
        d3hVar.c();
        ((e3h) d3hVar.b).I();
        d3hVar.c();
        ((e3h) d3hVar.b).K();
        d3hVar.c();
        ((e3h) d3hVar.b).N();
        if (obj instanceof String) {
            d3hVar.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            d3hVar.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            d3hVar.c();
            ((e3h) d3hVar.b).J(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                d3h d3hVarD = e3h.D();
                for (String str : bundle.keySet()) {
                    d3h d3hVarD2 = e3h.D();
                    d3hVarD2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        d3hVarD2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        d3hVarD2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        d3hVarD2.c();
                        ((e3h) d3hVarD2.b).J(dDoubleValue2);
                    }
                    d3hVarD.c();
                    ((e3h) d3hVarD.b).L((e3h) d3hVarD2.e());
                }
                if (((e3h) d3hVarD.b).C() > 0) {
                    arrayList.add((e3h) d3hVarD.e());
                }
            }
        }
        d3hVar.c();
        ((e3h) d3hVar.b).M(arrayList);
    }

    public final kbh Z0(String str, u3h u3hVar, t2h t2hVar, String str2) {
        int iIndexOf;
        upg.a();
        w3h w3hVar = (w3h) this.b;
        qqg qqgVar = w3hVar.d;
        if (!qqgVar.L0(str, bzg.O0)) {
            return null;
        }
        w3hVar.y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(qqgVar.H0(str, bzg.t0).split(",")));
        ich ichVar = this.c;
        zbh zbhVar = ichVar.x;
        y2h y2hVar = ichVar.a;
        y2h y2hVar2 = zbhVar.c.a;
        ich.S(y2hVar2);
        String strN0 = y2hVar2.N0(str);
        Uri.Builder builder = new Uri.Builder();
        qqg qqgVar2 = ((w3h) zbhVar.b).d;
        builder.scheme(qqgVar2.H0(str, bzg.m0));
        if (TextUtils.isEmpty(strN0)) {
            builder.authority(qqgVar2.H0(str, bzg.n0));
        } else {
            String strH0 = qqgVar2.H0(str, bzg.n0);
            StringBuilder sb = new StringBuilder(String.valueOf(strN0).length() + 1 + String.valueOf(strH0).length());
            sb.append(strN0);
            sb.append(".");
            sb.append(strH0);
            builder.authority(sb.toString());
        }
        builder.path(qqgVar2.H0(str, bzg.o0));
        Q0(builder, "gmp_app_id", ((z3h) u3hVar.b).G(), hashSet);
        qqgVar.G0();
        Q0(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strA = ((z3h) u3hVar.b).A();
        azg azgVar = bzg.R0;
        if (qqgVar.L0(str, azgVar)) {
            ich.S(y2hVar);
            if (y2hVar.U0(str)) {
                strA = "";
            }
        }
        Q0(builder, "app_instance_id", strA, hashSet);
        Q0(builder, "rdid", ((z3h) u3hVar.b).x(), hashSet);
        Q0(builder, "bundle_id", u3hVar.o(), hashSet);
        String strN = t2hVar.n();
        String strU = rfc.u(strN, ok8.y, ok8.t);
        if (true != TextUtils.isEmpty(strU)) {
            strN = strU;
        }
        Q0(builder, "app_event_name", strN, hashSet);
        Q0(builder, "app_version", String.valueOf(((z3h) u3hVar.b).M()), hashSet);
        String strL2 = ((z3h) u3hVar.b).l2();
        if (qqgVar.L0(str, azgVar)) {
            ich.S(y2hVar);
            if (y2hVar.T0(str) && !TextUtils.isEmpty(strL2) && (iIndexOf = strL2.indexOf(".")) != -1) {
                strL2 = strL2.substring(0, iIndexOf);
            }
        }
        Q0(builder, "os_version", strL2, hashSet);
        Q0(builder, "timestamp", String.valueOf(t2hVar.p()), hashSet);
        if (((z3h) u3hVar.b).z()) {
            Q0(builder, "lat", "1", hashSet);
        }
        Q0(builder, "privacy_sandbox_version", String.valueOf(((z3h) u3hVar.b).I0()), hashSet);
        Q0(builder, "trigger_uri_source", "1", hashSet);
        Q0(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        Q0(builder, "request_uuid", str2, hashSet);
        List<e3h> listH = t2hVar.h();
        Bundle bundle = new Bundle();
        for (e3h e3hVar : listH) {
            String strS = e3hVar.s();
            if (e3hVar.z()) {
                bundle.putString(strS, String.valueOf(e3hVar.A()));
            } else if (e3hVar.x()) {
                bundle.putString(strS, String.valueOf(e3hVar.y()));
            } else if (e3hVar.t()) {
                bundle.putString(strS, e3hVar.u());
            } else if (e3hVar.v()) {
                bundle.putString(strS, String.valueOf(e3hVar.w()));
            }
        }
        T0(builder, qqgVar.H0(str, bzg.s0).split("\\|"), bundle, hashSet);
        List<p4h> listUnmodifiableList = Collections.unmodifiableList(((z3h) u3hVar.b).X1());
        Bundle bundle2 = new Bundle();
        for (p4h p4hVar : listUnmodifiableList) {
            String strT = p4hVar.t();
            if (p4hVar.A()) {
                bundle2.putString(strT, String.valueOf(p4hVar.B()));
            } else if (p4hVar.y()) {
                bundle2.putString(strT, String.valueOf(p4hVar.z()));
            } else if (p4hVar.u()) {
                bundle2.putString(strT, p4hVar.v());
            } else if (p4hVar.w()) {
                bundle2.putString(strT, String.valueOf(p4hVar.x()));
            }
        }
        T0(builder, qqgVar.H0(str, bzg.r0).split("\\|"), bundle2, hashSet);
        Q0(builder, "dma", true != ((z3h) u3hVar.b).F0() ? "0" : "1", hashSet);
        if (!((z3h) u3hVar.b).H0().isEmpty()) {
            Q0(builder, "dma_cps", ((z3h) u3hVar.b).H0(), hashSet);
        }
        if (((z3h) u3hVar.b).N0()) {
            o1h o1hVarO0 = ((z3h) u3hVar.b).O0();
            if (!o1hVarO0.F().isEmpty()) {
                Q0(builder, "dl_gclid", o1hVarO0.F(), hashSet);
            }
            if (!o1hVarO0.H().isEmpty()) {
                Q0(builder, "dl_gbraid", o1hVarO0.H(), hashSet);
            }
            if (!o1hVarO0.J().isEmpty()) {
                Q0(builder, "dl_gs", o1hVarO0.J(), hashSet);
            }
            if (o1hVarO0.L() > 0) {
                Q0(builder, "dl_ss_ts", String.valueOf(o1hVarO0.L()), hashSet);
            }
            if (!o1hVarO0.N().isEmpty()) {
                Q0(builder, "mr_gclid", o1hVarO0.N(), hashSet);
            }
            if (!o1hVarO0.P().isEmpty()) {
                Q0(builder, "mr_gbraid", o1hVarO0.P(), hashSet);
            }
            if (!o1hVarO0.R().isEmpty()) {
                Q0(builder, "mr_gs", o1hVarO0.R(), hashSet);
            }
            if (o1hVarO0.T() > 0) {
                Q0(builder, "mr_click_ts", String.valueOf(o1hVarO0.T()), hashSet);
            }
        }
        return new kbh(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final v2h a1(yl ylVar) {
        t2h t2hVarH = v2h.H();
        long j = ylVar.d;
        t2hVarH.c();
        ((v2h) t2hVarH.b).P(j);
        long j2 = ylVar.c;
        t2hVarH.c();
        ((v2h) t2hVarH.b).r(j2);
        Bundle bundle = ((esg) ylVar.h).a;
        for (String str : bundle.keySet()) {
            d3h d3hVarD = e3h.D();
            d3hVarD.h(str);
            Object obj = bundle.get(str);
            oa7.A(obj);
            Y0(d3hVarD, obj);
            t2hVarH.l(d3hVarD);
        }
        String str2 = (String) ylVar.g;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            d3h d3hVarD2 = e3h.D();
            d3hVarD2.h("_o");
            d3hVarD2.i(str2);
            t2hVarH.k((e3h) d3hVarD2.e());
        }
        return (v2h) t2hVarH.e();
    }

    public final String b1(t3h t3hVar) {
        String str;
        String str2;
        String str3;
        w1h w1hVarK0;
        StringBuilder sbO = ub3.o("\nbatch {\n");
        if (t3hVar.w()) {
            V0(sbO, 0, "upload_subdomain", t3hVar.x());
        }
        if (t3hVar.u()) {
            V0(sbO, 0, "sgtm_join_id", t3hVar.v());
        }
        for (z3h z3hVar : t3hVar.r()) {
            if (z3hVar != null) {
                P0(1, sbO);
                sbO.append("bundle {\n");
                if (z3hVar.R()) {
                    V0(sbO, 1, "protocol_version", Integer.valueOf(z3hVar.R0()));
                }
                ((dqg) cqg.b.a.get()).getClass();
                w3h w3hVar = (w3h) this.b;
                qqg qqgVar = w3hVar.d;
                i0h i0hVar = w3hVar.x;
                if (qqgVar.L0(z3hVar.r(), bzg.M0) && z3hVar.x0()) {
                    V0(sbO, 1, "session_stitching_token", z3hVar.y0());
                }
                V0(sbO, 1, "platform", z3hVar.k2());
                if (z3hVar.t()) {
                    V0(sbO, 1, "gmp_version", Long.valueOf(z3hVar.u()));
                }
                if (z3hVar.v()) {
                    V0(sbO, 1, "uploading_gmp_version", Long.valueOf(z3hVar.w()));
                }
                if (z3hVar.t0()) {
                    V0(sbO, 1, "dynamite_version", Long.valueOf(z3hVar.u0()));
                }
                if (z3hVar.N()) {
                    V0(sbO, 1, "config_version", Long.valueOf(z3hVar.O()));
                }
                V0(sbO, 1, "gmp_app_id", z3hVar.G());
                V0(sbO, 1, "app_id", z3hVar.r());
                V0(sbO, 1, "app_version", z3hVar.s());
                if (z3hVar.L()) {
                    V0(sbO, 1, "app_version_major", Integer.valueOf(z3hVar.M()));
                }
                V0(sbO, 1, "firebase_instance_id", z3hVar.K());
                if (z3hVar.B()) {
                    V0(sbO, 1, "dev_cert_hash", Long.valueOf(z3hVar.C()));
                }
                V0(sbO, 1, "app_store", z3hVar.q2());
                if (z3hVar.a2()) {
                    V0(sbO, 1, "upload_timestamp_millis", Long.valueOf(z3hVar.b2()));
                }
                if (z3hVar.c2()) {
                    V0(sbO, 1, "start_timestamp_millis", Long.valueOf(z3hVar.d2()));
                }
                if (z3hVar.e2()) {
                    V0(sbO, 1, "end_timestamp_millis", Long.valueOf(z3hVar.f2()));
                }
                if (z3hVar.g2()) {
                    V0(sbO, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(z3hVar.h2()));
                }
                if (z3hVar.i2()) {
                    V0(sbO, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(z3hVar.j2()));
                }
                V0(sbO, 1, "app_instance_id", z3hVar.A());
                V0(sbO, 1, "resettable_device_id", z3hVar.x());
                V0(sbO, 1, "ds_id", z3hVar.Q());
                if (z3hVar.y()) {
                    V0(sbO, 1, "limited_ad_tracking", Boolean.valueOf(z3hVar.z()));
                }
                V0(sbO, 1, "os_version", z3hVar.l2());
                V0(sbO, 1, "device_model", z3hVar.m2());
                V0(sbO, 1, "user_default_language", z3hVar.n2());
                if (z3hVar.o2()) {
                    V0(sbO, 1, "time_zone_offset_minutes", Integer.valueOf(z3hVar.p2()));
                }
                if (z3hVar.D()) {
                    V0(sbO, 1, "bundle_sequential_index", Integer.valueOf(z3hVar.E()));
                }
                if (z3hVar.L0()) {
                    V0(sbO, 1, "delivery_index", Integer.valueOf(z3hVar.M0()));
                }
                if (z3hVar.H()) {
                    V0(sbO, 1, "service_upload", Boolean.valueOf(z3hVar.I()));
                }
                V0(sbO, 1, "health_monitor", z3hVar.F());
                if (z3hVar.r0()) {
                    V0(sbO, 1, "retry_counter", Integer.valueOf(z3hVar.s0()));
                }
                if (z3hVar.v0()) {
                    V0(sbO, 1, "consent_signals", z3hVar.w0());
                }
                if (z3hVar.E0()) {
                    V0(sbO, 1, "is_dma_region", Boolean.valueOf(z3hVar.F0()));
                }
                if (z3hVar.G0()) {
                    V0(sbO, 1, "core_platform_services", z3hVar.H0());
                }
                if (z3hVar.C0()) {
                    V0(sbO, 1, "consent_diagnostics", z3hVar.D0());
                }
                if (z3hVar.z0()) {
                    V0(sbO, 1, "target_os_version", Long.valueOf(z3hVar.A0()));
                }
                upg.a();
                if (qqgVar.L0(z3hVar.r(), bzg.O0)) {
                    V0(sbO, 1, "ad_services_version", Integer.valueOf(z3hVar.I0()));
                    if (z3hVar.J0() && (w1hVarK0 = z3hVar.K0()) != null) {
                        P0(2, sbO);
                        sbO.append("attribution_eligibility_status {\n");
                        V0(sbO, 2, "eligible", Boolean.valueOf(w1hVarK0.r()));
                        V0(sbO, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(w1hVarK0.s()));
                        V0(sbO, 2, "pre_r", Boolean.valueOf(w1hVarK0.t()));
                        V0(sbO, 2, "r_extensions_too_old", Boolean.valueOf(w1hVarK0.u()));
                        V0(sbO, 2, "adservices_extension_too_old", Boolean.valueOf(w1hVarK0.v()));
                        V0(sbO, 2, "ad_storage_not_allowed", Boolean.valueOf(w1hVarK0.w()));
                        V0(sbO, 2, "measurement_manager_disabled", Boolean.valueOf(w1hVarK0.x()));
                        P0(2, sbO);
                        sbO.append("}\n");
                    }
                }
                if (z3hVar.N0()) {
                    o1h o1hVarO0 = z3hVar.O0();
                    P0(2, sbO);
                    sbO.append("ad_campaign_info {\n");
                    if (o1hVarO0.E()) {
                        V0(sbO, 2, "deep_link_gclid", o1hVarO0.F());
                    }
                    if (o1hVarO0.G()) {
                        V0(sbO, 2, "deep_link_gbraid", o1hVarO0.H());
                    }
                    if (o1hVarO0.I()) {
                        V0(sbO, 2, "deep_link_gad_source", o1hVarO0.J());
                    }
                    if (o1hVarO0.U()) {
                        V0(sbO, 2, "deep_link_url", o1hVarO0.V());
                    }
                    if (o1hVarO0.K()) {
                        V0(sbO, 2, "deep_link_session_millis", Long.valueOf(o1hVarO0.L()));
                    }
                    if (o1hVarO0.M()) {
                        V0(sbO, 2, "market_referrer_gclid", o1hVarO0.N());
                    }
                    if (o1hVarO0.O()) {
                        V0(sbO, 2, "market_referrer_gbraid", o1hVarO0.P());
                    }
                    if (o1hVarO0.Q()) {
                        V0(sbO, 2, "market_referrer_gad_source", o1hVarO0.R());
                    }
                    if (o1hVarO0.S()) {
                        V0(sbO, 2, "market_referrer_click_millis", Long.valueOf(o1hVarO0.T()));
                    }
                    P0(2, sbO);
                    sbO.append("}\n");
                }
                if (z3hVar.S()) {
                    V0(sbO, 1, "batching_timestamp_millis", Long.valueOf(z3hVar.T()));
                }
                if (z3hVar.P0()) {
                    m4h m4hVarQ0 = z3hVar.Q0();
                    P0(2, sbO);
                    sbO.append("sgtm_diagnostics {\n");
                    int iV = m4hVarQ0.v();
                    if (iV == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iV == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iV != 3) {
                        str2 = iV != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    V0(sbO, 2, "upload_type", str2);
                    V0(sbO, 2, "client_upload_eligibility", m4hVarQ0.r().name());
                    int iW = m4hVarQ0.w();
                    if (iW == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iW == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iW == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iW != 4) {
                        str3 = iW != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    V0(sbO, 2, "service_upload_eligibility", str3);
                    P0(2, sbO);
                    sbO.append("}\n");
                }
                if (z3hVar.U()) {
                    n2h n2hVarV = z3hVar.V();
                    P0(2, sbO);
                    sbO.append("consent_info_extra {\n");
                    for (j2h j2hVar : n2hVarV.r()) {
                        P0(3, sbO);
                        sbO.append("limited_data_modes {\n");
                        int iS = j2hVar.s();
                        if (iS == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iS == 2) {
                            str = "AD_STORAGE";
                        } else if (iS != 3) {
                            str = iS != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        V0(sbO, 3, "type", str);
                        int iT = j2hVar.t();
                        V0(sbO, 3, "mode", iT != 1 ? iT != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        P0(3, sbO);
                        sbO.append("}\n");
                    }
                    P0(2, sbO);
                    sbO.append("}\n");
                }
                zmg<p4h> zmgVarX1 = z3hVar.X1();
                if (zmgVarX1 != null) {
                    for (p4h p4hVar : zmgVarX1) {
                        if (p4hVar != null) {
                            P0(2, sbO);
                            sbO.append("user_property {\n");
                            V0(sbO, 2, "set_timestamp_millis", p4hVar.r() ? Long.valueOf(p4hVar.s()) : null);
                            V0(sbO, 2, "name", i0hVar.c(p4hVar.t()));
                            V0(sbO, 2, "string_value", p4hVar.v());
                            V0(sbO, 2, "int_value", p4hVar.w() ? Long.valueOf(p4hVar.x()) : null);
                            V0(sbO, 2, "double_value", p4hVar.A() ? Double.valueOf(p4hVar.B()) : null);
                            P0(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                zmg<z1h> zmgVarJ = z3hVar.J();
                if (zmgVarJ != null) {
                    for (z1h z1hVar : zmgVarJ) {
                        if (z1hVar != null) {
                            P0(2, sbO);
                            sbO.append("audience_membership {\n");
                            if (z1hVar.r()) {
                                V0(sbO, 2, "audience_id", Integer.valueOf(z1hVar.s()));
                            }
                            if (z1hVar.w()) {
                                V0(sbO, 2, "new_audience", Boolean.valueOf(z1hVar.x()));
                            }
                            U0(sbO, "current_data", z1hVar.t());
                            if (z1hVar.u()) {
                                U0(sbO, "previous_data", z1hVar.v());
                            }
                            P0(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                List<v2h> listR1 = z3hVar.R1();
                if (listR1 != null) {
                    for (v2h v2hVar : listR1) {
                        if (v2hVar != null) {
                            P0(2, sbO);
                            sbO.append("event {\n");
                            V0(sbO, 2, "name", i0hVar.a(v2hVar.w()));
                            if (v2hVar.x()) {
                                V0(sbO, 2, "timestamp_millis", Long.valueOf(v2hVar.y()));
                            }
                            if (qqgVar.L0(null, bzg.e1) && v2hVar.D()) {
                                V0(sbO, 2, "corrected_timestamp_millis", Long.valueOf(v2hVar.E()));
                            }
                            if (v2hVar.z()) {
                                V0(sbO, 2, "previous_timestamp_millis", Long.valueOf(v2hVar.A()));
                            }
                            if (v2hVar.B()) {
                                V0(sbO, 2, "count", Integer.valueOf(v2hVar.C()));
                            }
                            if (v2hVar.u() != 0) {
                                N0(sbO, 2, (zmg) v2hVar.t());
                            }
                            P0(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                P0(1, sbO);
                sbO.append("}\n");
            }
        }
        sbO.append("} // End-of-batch\n");
        return sbO.toString();
    }

    public final String c1(uyg uygVar) {
        StringBuilder sbO = ub3.o("\nproperty_filter {\n");
        if (uygVar.r()) {
            V0(sbO, 0, "filter_id", Integer.valueOf(uygVar.s()));
        }
        V0(sbO, 0, "property_name", ((w3h) this.b).x.c(uygVar.t()));
        String strR0 = R0(uygVar.v(), uygVar.w(), uygVar.y());
        if (!strR0.isEmpty()) {
            V0(sbO, 0, "filter_type", strR0);
        }
        O0(sbO, 1, uygVar.u());
        sbO.append("}\n");
        return sbO.toString();
    }

    public final Parcelable d1(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (fcc unused) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List h1(ymg ymgVar, List list) {
        int i;
        w3h w3hVar = (w3h) this.b;
        ArrayList arrayList = new ArrayList(ymgVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.x.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.x.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean i1(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((w3h) this.b).y.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long j1(byte[] bArr) {
        oa7.A(bArr);
        w3h w3hVar = (w3h) this.b;
        qch qchVar = w3hVar.w;
        w3h.f(qchVar);
        qchVar.A0();
        MessageDigest messageDigestT0 = qch.T0();
        if (messageDigestT0 != null) {
            return qch.U0(messageDigestT0.digest(bArr));
        }
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.g.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] k1(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.b(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // defpackage.wbh
    public final void D0() {
    }
}
