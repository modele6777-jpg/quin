package defpackage;

import ai.askquin.MainActivity;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$GraphEntry;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tech.chatmind.api.WhereDidYouHear;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf6 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jf6(ia9 ia9Var, da9 da9Var, boolean z) {
        this.a = 26;
        this.b = ia9Var;
        this.c = da9Var;
    }

    /* JADX WARN: Code duplicated, block: B:288:0x0604  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [p89] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [p89] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r3v24 */
    @Override // defpackage.x16
    public final Object invoke() {
        long jA;
        String[] strArrNames;
        int i = 10;
        boolean z = true;
        ks6[] ks6VarArr = null;
        ks6VarArr = null;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((imb) this.b).element && ((Boolean) ((lf6) this.c).b.invoke()).booleanValue());
            case 1:
                gj6 gj6Var = (gj6) this.b;
                p9 p9Var = new p9(19, (x16) this.c);
                if (gj6Var.d == ej6.a) {
                    gj6Var.d = ej6.b;
                    Set set = (Set) gj6Var.e.getValue();
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((WhereDidYouHear) it.next()).getId());
                    }
                    ynb.V(hwf.a(gj6Var), null, null, new fj6(gj6Var, arrayList, p9Var, set, null), 3);
                }
                return wef.a;
            case 2:
                ((a26) this.b).d(((z63) this.c).a);
                return wef.a;
            case 3:
                ((a26) this.b).d(((cn6) this.c).b);
                return wef.a;
            case 4:
                fl6 fl6Var = (fl6) this.b;
                j18 j18Var = (j18) this.c;
                el6 el6Var = (el6) fl6Var;
                if (el6Var.c && !el6Var.b) {
                    b18 b18VarH = j18Var.h();
                    c18 c18Var = (c18) s72.H0(b18VarH.l);
                    z = c18Var != null && c18Var.a >= b18VarH.o + (-5);
                }
                return Boolean.valueOf(z);
            case 5:
                ((pl6) this.b).d((i09) this.c);
                return wef.a;
            case 6:
                h0e h0eVar = (h0e) this.b;
                q7b q7bVar = (q7b) this.c;
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new ia("homepage", 28), 2);
                TarotSkinIdentify tarotSkinIdentify = ((oo6) h0eVar.getValue()).d;
                if (tarotSkinIdentify != null) {
                    ka9.e(q7bVar.a, new ExploreTarotRoute$GraphEntry(tarotSkinIdentify), null, 6);
                }
                return wef.a;
            case 7:
                kq6 kq6Var = (kq6) this.b;
                e89 e89Var = (e89) this.c;
                if (((q3b) e89Var.getValue()) instanceof o3b) {
                    kq6Var.f();
                } else {
                    e89Var.setValue(o3b.a);
                }
                return wef.a;
            case 8:
                ds6 ds6Var = (ds6) this.b;
                ks6 ks6Var = (ks6) this.c;
                try {
                    ds6Var.a.b(ks6Var);
                    break;
                } catch (IOException e) {
                    sea seaVar = sea.a;
                    sea.a.i(4, "Http2Connection.Listener failure for " + ds6Var.c, e);
                    try {
                        ks6Var.c(ay4.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return wef.a;
            case 9:
                n5 n5Var = (n5) this.b;
                r3d r3dVar = (r3d) this.c;
                mmb mmbVar = new mmb();
                ds6 ds6Var2 = (ds6) n5Var.b;
                synchronized (ds6Var2.L0) {
                    try {
                        synchronized (ds6Var2) {
                            try {
                                r3d r3dVar2 = ds6Var2.G0;
                                r3d r3dVar3 = new r3d();
                                r3dVar2.getClass();
                                for (int i2 = 0; i2 < 10; i2++) {
                                    if (((1 << i2) & r3dVar2.a) != 0) {
                                        r3dVar3.b(i2, r3dVar2.b[i2]);
                                    }
                                }
                                for (int i3 = 0; i3 < 10; i3++) {
                                    if (((1 << i3) & r3dVar.a) != 0) {
                                        r3dVar3.b(i3, r3dVar.b[i3]);
                                    }
                                }
                                mmbVar.element = r3dVar3;
                                jA = ((long) r3dVar3.a()) - ((long) r3dVar2.a());
                                if (jA != 0 && !ds6Var2.b.isEmpty()) {
                                    ks6VarArr = (ks6[]) ds6Var2.b.values().toArray(new ks6[0]);
                                }
                                r3d r3dVar4 = (r3d) mmbVar.element;
                                r3dVar4.getClass();
                                ds6Var2.G0 = r3dVar4;
                                jle.b(ds6Var2.x, ds6Var2.c + " onSettings", new jf6(i, ds6Var2, mmbVar));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            ds6Var2.L0.b((r3d) mmbVar.element);
                        } catch (IOException e2) {
                            ay4 ay4Var = ay4.PROTOCOL_ERROR;
                            ds6Var2.b(ay4Var, ay4Var, e2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (ks6VarArr != null) {
                    for (ks6 ks6Var2 : ks6VarArr) {
                        synchronized (ks6Var2) {
                            ks6Var2.e += jA;
                            if (jA > 0) {
                                ks6Var2.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ds6 ds6Var3 = (ds6) this.b;
                ds6Var3.a.a(ds6Var3, (r3d) ((mmb) this.c).element);
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                yc7 yc7Var = (yc7) this.b;
                String string = ((use) this.c).d().c.toString();
                yc7Var.getClass();
                string.getClass();
                int i4 = hmb.b;
                String strY = v4e.Y("'", v4e.o0(string).toString());
                return Boolean.valueOf(v4e.Q(strY) ? false : !yc7.i(strY).equals((String) yc7Var.Y.getValue()));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                nyc nycVar = (nyc) this.b;
                wg7 wg7Var = (wg7) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                pi7.d(wg7Var, nycVar);
                int iE = nycVar.e();
                for (int i5 = 0; i5 < iE; i5++) {
                    List listH = nycVar.h(i5);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof oi7) {
                            arrayList2.add(obj);
                        }
                    }
                    oi7 oi7Var = (oi7) s72.Z0(arrayList2);
                    if (oi7Var != null && (strArrNames = oi7Var.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = pa7.t(nycVar.g(), ryc.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String str3 = "The suggested name '" + str + "' for " + str2 + ' ' + nycVar.f(i5) + " is already one of the names for " + str2 + ' ' + nycVar.f(((Number) bm8.B(linkedHashMap, str)).intValue()) + " in " + nycVar;
                                throw new lh7(kj0.b0(str3, null, null, -1, null), str3, null, -1, null, null);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i5));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? qu4.a : linkedHashMap;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((a26) this.b).d((Locale) this.c);
                return wef.a;
            case 14:
                LayoutNode layoutNode = (LayoutNode) this.b;
                mmb mmbVar2 = (mmb) this.c;
                wo0 wo0Var = layoutNode.V0;
                if ((((i09) wo0Var.g).d & 8) != 0) {
                    for (i09 i09Var = (zde) wo0Var.f; i09Var != null; i09Var = i09Var.e) {
                        if ((i09Var.c & 8) != 0) {
                            ?? M0 = i09Var;
                            ?? p89Var = 0;
                            while (M0 != 0) {
                                if (M0 instanceof wwc) {
                                    wwc wwcVar = (wwc) M0;
                                    if (wwcVar.O()) {
                                        twc twcVar = new twc();
                                        mmbVar2.element = twcVar;
                                        twcVar.d = true;
                                    }
                                    if (wwcVar.S0()) {
                                        ((twc) mmbVar2.element).c = true;
                                    }
                                    wwcVar.R0((hxc) mmbVar2.element);
                                } else if ((M0.c & 8) != 0 && (M0 instanceof sv3)) {
                                    i09 i09Var2 = ((sv3) M0).E0;
                                    int i6 = 0;
                                    while (i09Var2 != null) {
                                        if ((i09Var2.c & 8) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                M0 = M0;
                                                p89Var = p89Var;
                                                p89Var = p89Var;
                                                M0 = i09Var2;
                                            } else {
                                                if (p89Var == 0) {
                                                    p89Var = new p89(0, new i09[16]);
                                                }
                                                if (M0 != 0) {
                                                    p89Var.b(M0);
                                                    M0 = 0;
                                                }
                                                p89Var.b(i09Var2);
                                            }
                                        } else {
                                            M0 = M0;
                                            p89Var = p89Var;
                                        }
                                        i09Var2 = i09Var2.f;
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                    if (i6 == 1) {
                                        M0 = M0;
                                        p89Var = p89Var;
                                    } else {
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                }
                                M0 = vd0.m0(p89Var);
                            }
                        }
                    }
                }
                return wef.a;
            case 15:
                mx3 mx3Var = (mx3) this.b;
                jx7 jx7Var = (jx7) this.c;
                sw7 sw7Var = (sw7) mx3Var.getValue();
                return new tw7(jx7Var, sw7Var, new os((z67) jx7Var.d.f.getValue(), sw7Var));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                mx3 mx3Var2 = (mx3) this.b;
                yx9 yx9Var = (yx9) this.c;
                nx9 nx9Var = (nx9) mx3Var2.getValue();
                return new ox9(yx9Var, nx9Var, new os((z67) ((wz7) yx9Var.d.f).getValue(), nx9Var));
            case 17:
                return new o18((ucc) this.b, qu4.a, (qcc) this.c);
            case 18:
                String str4 = (String) this.b;
                Intent intent = (Intent) this.c;
                int i7 = MainActivity.Z0;
                String stringExtra = intent.getStringExtra("push_id");
                boolean zHasExtra = intent.hasExtra("seasonal_year");
                Integer numValueOf = Integer.valueOf(intent.getIntExtra("seasonal_year", 0));
                boolean zHasExtra2 = intent.hasExtra("seasonal_term");
                String stringExtra2 = intent.getStringExtra("seasonal_term");
                if (str4 == null) {
                    return null;
                }
                int iHashCode = str4.hashCode();
                if (iHashCode != 1157931858) {
                    if (iHashCode == 1306402775) {
                        if (!str4.equals("four_seasons")) {
                            return null;
                        }
                        yic yicVar = yic.c;
                        if (!zHasExtra) {
                            numValueOf = null;
                        }
                        if (!zHasExtra2) {
                            stringExtra2 = null;
                        }
                        yic yicVarL = drb.l(stringExtra2, numValueOf);
                        if (yicVarL != null) {
                            return new dh9(str4, stringExtra, yicVarL);
                        }
                        return null;
                    }
                    if (iHashCode != 1527017856 || !str4.equals("daily_push")) {
                        return null;
                    }
                } else if (!str4.equals("tomorrow_fortune_push")) {
                    return null;
                }
                return new dh9(str4, stringExtra, null);
            case 19:
                View view = (View) this.b;
                iu8 iu8Var = (iu8) this.c;
                if (!bp.d(view)) {
                    ListIterator listIterator = iu8Var.a.listIterator();
                    while (true) {
                        ql6 ql6Var = (ql6) listIterator;
                        if (ql6Var.hasNext()) {
                            fwc fwcVar = ((hu8) ql6Var.next()).a.b;
                            if (fwcVar != null) {
                                fwcVar.m();
                            }
                        }
                    }
                }
                return wef.a;
            case 20:
                ((cx8) this.b).b((Set) this.c);
                return wef.a;
            case 21:
                hy8 hy8Var = (hy8) this.b;
                s7a s7aVar = (s7a) this.c;
                AtomicBoolean atomicBoolean = hy8Var.c;
                tx8 tx8Var = hy8Var.a;
                if (!atomicBoolean.get() || tx8Var.f()) {
                    z = false;
                } else {
                    Map map = s7aVar.b;
                    String str5 = s7aVar.a;
                    JSONObject jSONObject = new JSONObject(map);
                    jSONObject.put("uid", str5);
                    jSONObject.put("time", s7aVar.c / 1000);
                    jSONObject.put("$insert_id", s7aVar.d);
                    jSONObject.put("distinct_id", str5);
                    jSONObject.put("$user_id", str5);
                    Object obj2 = s7aVar.e;
                    if (obj2 == null) {
                        obj2 = JSONObject.NULL;
                    }
                    jSONObject.put("$device_id", obj2);
                    tx8Var.k("sign_up_completed", jSONObject);
                }
                return Boolean.valueOf(z);
            case 22:
                hy8 hy8Var2 = (hy8) this.b;
                JSONObject jSONObject2 = (JSONObject) this.c;
                if (hy8Var2.c.get()) {
                    ssg ssgVar = hy8Var2.a.f;
                    tx8 tx8Var2 = (tx8) ssgVar.b;
                    if (!tx8Var2.f()) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(tx8Var2.h);
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                jSONObject3.put(next, jSONObject2.get(next));
                            }
                            zl.a(jSONObject3, tx8Var2.l);
                            tx8Var2.h(ssgVar.O(jSONObject3, "$set"));
                        } catch (JSONException e3) {
                            db6.G("MixpanelAPI.API", "Exception setting people properties", e3);
                        }
                    }
                    break;
                }
                return wef.a;
            case 23:
                ted tedVar = (ted) this.b;
                aw2 aw2Var = (aw2) this.c;
                if (((Boolean) tedVar.d.d.d(ued.c)).booleanValue()) {
                    ynb.V(aw2Var, null, null, new xz8(tedVar, null), 3);
                }
                return Boolean.TRUE;
            case 24:
                a29 a29Var = (a29) this.b;
                a26 a26Var = (a26) this.c;
                z19 z19Var = a29Var instanceof z19 ? (z19) a29Var : null;
                if (z19Var != null) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(p05.a, new nd8(26), 2);
                    a26Var.d(z19Var.c);
                }
                return wef.a;
            case 25:
                ((a26) this.c).d(Boolean.valueOf(((v50) this.b) == v50.f));
                return wef.a;
            case 26:
                ia9 ia9Var = (ia9) this.b;
                da9 da9Var = (da9) this.c;
                da9Var.getClass();
                synchronized (ia9Var.a) {
                    try {
                        s0e s0eVar = ia9Var.b;
                        Iterable iterable = (Iterable) s0eVar.getValue();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : iterable) {
                            if (pa7.t((da9) obj3, da9Var)) {
                                s0eVar.n(null, arrayList3);
                            } else {
                                arrayList3.add(obj3);
                            }
                        }
                        s0eVar.n(null, arrayList3);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return wef.a;
            case 27:
                gg7 gg7Var = (gg7) this.b;
                qjb qjbVar = (qjb) this.c;
                if (((xh0) gg7Var.b).get() == 0) {
                    qjbVar.invoke();
                }
                return wef.a;
            case 28:
                uo uoVar = (uo) this.b;
                x16 x16Var = (x16) this.c;
                if (uoVar.a()) {
                    ynb.V(lw2.a, null, null, new ki9(2, null), 3);
                    x16Var.invoke();
                }
                return wef.a;
            default:
                ((gj9) this.b).g((Context) this.c);
                return wef.a;
        }
    }

    public /* synthetic */ jf6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
