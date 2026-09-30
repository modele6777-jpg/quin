package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ws4 implements ia1, goe {
    public static final long[] e = new long[0];
    public long a;
    public Object b;
    public Object c;
    public final Object d;

    public ws4(nyc nycVar, gl glVar) {
        nycVar.getClass();
        this.b = nycVar;
        this.c = glVar;
        int iE = nycVar.e();
        if (iE <= 64) {
            this.a = iE != 64 ? (-1) << iE : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            jArr[i - 1] = (-1) << iE;
        }
        this.d = jArr;
    }

    public static void b(ws4 ws4Var, int i) {
        Object next;
        Collection collection;
        cge cgeVar = cge.g;
        int i2 = (i & 1) != 0 ? 2 : 1;
        if ((i & 2) != 0) {
            cgeVar = null;
        }
        while (((LinkedHashMap) ws4Var.c).size() > i2) {
            Set setKeySet = ((LinkedHashMap) ws4Var.c).keySet();
            setKeySet.getClass();
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                cge cgeVar2 = (cge) next;
                if (!pa7.t(cgeVar2, cgeVar) && ((collection = (Collection) ((HashMap) ws4Var.d).get(cgeVar2)) == null || collection.isEmpty())) {
                    break;
                }
            }
            cge cgeVar3 = (cge) next;
            if (cgeVar3 == null) {
                return;
            }
            bhe bheVar = (bhe) ((LinkedHashMap) ws4Var.c).remove(cgeVar3);
            if (bheVar != null) {
                bheVar.l = true;
                bheVar.d.clear();
                bheVar.e.clear();
                bheVar.f.clear();
                bheVar.g.clear();
                bheVar.h = qu4.a;
                bheVar.c.removeCallbacks(bheVar.m);
                int i3 = 0;
                bheVar.k = false;
                bheVar.j = 1000L;
                ihe iheVar = bheVar.a;
                if (iheVar != null && !iheVar.g) {
                    iheVar.g = true;
                    Handler handler = nhe.a;
                    nhe.a.removeCallbacksAndMessages(iheVar.c);
                    nhe.a(iheVar.c, new ghe(iheVar, i3));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46 l46Var2;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        int i2;
        x16 x16Var;
        lx0 lx0Var;
        long j;
        CharSequence charSequence;
        g09 g09Var;
        ?? r1;
        l46 l46Var3;
        l46 l46Var4;
        l46 l46Var5 = l46Var;
        he2 he2Var5 = hj6.x;
        he2 he2Var6 = hj6.X;
        he2 he2Var7 = hj6.y;
        he2 he2Var8 = hj6.z;
        lx0 lx0Var2 = ndb.f;
        use useVar = (use) this.b;
        l46Var5.h0(-9174642);
        int i3 = i | (l46Var5.g(this) ? 32 : 16);
        if (l46Var5.W(i3 & 1, (i3 & 19) != 18)) {
            CharSequence charSequence2 = useVar.d().c;
            long j2 = useVar.d().d;
            int i4 = eue.c;
            int i5 = (int) (j2 >> 32);
            j09 j09Var = (j09) this.c;
            long j3 = this.a;
            h0e h0eVar = (h0e) this.d;
            xn8 xn8VarC = s21.c(lx0Var2, false);
            int iHashCode = Long.hashCode(l46Var5.T);
            u8a u8aVarM = l46Var5.m();
            int i6 = i5;
            g09 g09Var2 = g09.a;
            j09 j09VarJ = m93.J(l46Var5, g09Var2);
            lf2.q.getClass();
            l46Var5.j0();
            CharSequence charSequence3 = charSequence2;
            boolean z = l46Var5.S;
            x16 x16Var2 = LayoutNode.h1;
            if (z) {
                l46Var5.l(x16Var2);
            } else {
                l46Var5.s0();
            }
            dec.l(he2Var8, l46Var5, xn8VarC);
            dec.l(he2Var7, l46Var5, u8aVarM);
            ib8.s(iHashCode, l46Var5, he2Var6, l46Var5);
            dec.l(he2Var5, l46Var5, j09VarJ);
            j09 j09VarP = pa7.p(g09Var2, 0.0f);
            xn8 xn8VarC2 = s21.c(ndb.b, false);
            int iHashCode2 = Long.hashCode(l46Var5.T);
            u8a u8aVarM2 = l46Var5.m();
            j09 j09VarJ2 = m93.J(l46Var5, j09VarP);
            l46Var5.j0();
            lx0 lx0Var3 = lx0Var2;
            if (l46Var5.S) {
                l46Var5.l(x16Var2);
            } else {
                l46Var5.s0();
            }
            dec.l(he2Var8, l46Var5, xn8VarC2);
            dec.l(he2Var7, l46Var5, u8aVarM2);
            ib8.s(iHashCode2, l46Var5, he2Var6, l46Var5);
            dec.l(he2Var5, l46Var5, j09VarJ2);
            int i7 = 6;
            tec.q(6, dd2Var, l46Var5, true);
            j09 j09VarP2 = b.p(j09Var, 328.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var5, 6);
            int iHashCode3 = Long.hashCode(l46Var5.T);
            u8a u8aVarM3 = l46Var5.m();
            j09 j09VarJ3 = m93.J(l46Var5, j09VarP2);
            l46Var5.j0();
            if (l46Var5.S) {
                l46Var5.l(x16Var2);
            } else {
                l46Var5.s0();
            }
            dec.l(he2Var8, l46Var5, t7cVarA);
            dec.l(he2Var7, l46Var5, u8aVarM3);
            ib8.s(iHashCode3, l46Var5, he2Var6, l46Var5);
            dec.l(he2Var5, l46Var5, j09VarJ3);
            l46Var5.f0(-194694366);
            int i8 = 0;
            l46 l46Var6 = l46Var5;
            while (i8 < i7) {
                int i9 = i6 - i8;
                g09 g09Var3 = g09Var2;
                j09 j09VarZ = ynb.Z(db6.w(b.d(g09Var2, 64.0f).D(new jw7(1.0f, true)), i9 == 0 ? 1.3f : 1.0f, y72.b(j3, i9 == 0 ? 0.56f : 0.32f), a7c.b(eze.a(l46Var6).a.e)), 4.0f);
                lx0 lx0Var4 = lx0Var3;
                xn8 xn8VarC3 = s21.c(lx0Var4, false);
                int iHashCode4 = Long.hashCode(l46Var6.T);
                u8a u8aVarM4 = l46Var6.m();
                j09 j09VarJ4 = m93.J(l46Var6, j09VarZ);
                lf2.q.getClass();
                l46Var6.j0();
                if (l46Var6.S) {
                    l46Var6.l(x16Var2);
                } else {
                    l46Var6.s0();
                }
                dec.l(he2Var8, l46Var6, xn8VarC3);
                dec.l(he2Var7, l46Var6, u8aVarM4);
                ib8.s(iHashCode4, l46Var6, he2Var6, l46Var6);
                dec.l(he2Var5, l46Var6, j09VarJ4);
                if (i8 < charSequence3.length()) {
                    l46Var6.f0(1105964683);
                    CharSequence charSequence4 = charSequence3;
                    lx0Var = lx0Var4;
                    he2Var = he2Var5;
                    he2Var2 = he2Var6;
                    he2Var3 = he2Var7;
                    he2Var4 = he2Var8;
                    x16Var = x16Var2;
                    r1 = 0;
                    j = j3;
                    charSequence = charSequence4;
                    i2 = i8;
                    g09Var = g09Var3;
                    nte.b(String.valueOf(charSequence4.charAt(i8)), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var6.k(nte.a), ((m82) l46Var6.k(o82.a)).q, w6c.l(21), new ar5(Constants.MINIMAL_ERROR_STATUS_CODE), null, 0L, null, 3, w6c.l(24), null, null, 16613368), l46Var, 0, 0, 131070);
                    l46Var4 = l46Var;
                    l46Var4.r(false);
                } else {
                    he2Var = he2Var5;
                    he2Var2 = he2Var6;
                    he2Var3 = he2Var7;
                    he2Var4 = he2Var8;
                    i2 = i8;
                    x16Var = x16Var2;
                    lx0Var = lx0Var4;
                    j = j3;
                    charSequence = charSequence3;
                    g09Var = g09Var3;
                    r1 = 0;
                    l46Var6.f0(1106392328);
                    l46Var6.r(false);
                }
                if (i9 == 0) {
                    l46Var3 = l46Var6;
                    l46Var3 = l46Var4;
                    l46Var3.f0(1106443695);
                    s21.a(tm7.o(b.d(b.p(g09Var, 2.0f), 20.0f), y72.b(((m82) l46Var3.k(o82.a)).o, ((Number) h0eVar.getValue()).floatValue() * 0.6f), g21.f), l46Var3, r1);
                    l46Var3.r(r1);
                } else {
                    l46Var3 = l46Var6;
                    l46Var3 = l46Var4;
                    l46Var3.f0(1106713736);
                    l46Var3.r(r1);
                }
                l46Var3.r(true);
                g09Var2 = g09Var;
                i8 = i2 + 1;
                charSequence3 = charSequence;
                lx0Var3 = lx0Var;
                he2Var5 = he2Var;
                he2Var6 = he2Var2;
                j3 = j;
                i6 = i6;
                he2Var7 = he2Var3;
                he2Var8 = he2Var4;
                x16Var2 = x16Var;
                i7 = 6;
                l46Var6 = l46Var3;
            }
            tec.s(l46Var6, false, true, true);
            l46Var2 = l46Var6;
        } else {
            l46Var5.Z();
            l46Var2 = l46Var5;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(this, dd2Var, i, 22);
        }
    }

    public bhe a(Context context, cge cgeVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        bhe bheVar = (bhe) linkedHashMap.get(cgeVar);
        if (bheVar != null) {
            return bheVar;
        }
        b(this, 2);
        dxc dxcVar = (dxc) this.b;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        bhe bheVar2 = (bhe) dxcVar.z(applicationContext, cgeVar);
        linkedHashMap.put(cgeVar, bheVar2);
        return bheVar2;
    }

    public int c(dib dibVar, long j) {
        TimeZone timeZone = keg.a;
        ArrayList arrayList = dibVar.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + dibVar.c.a.h + " was leaked. Did you forget to close a response body?";
                sea seaVar = sea.a;
                sea.a.j(((aib) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    dibVar.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    @Override // defpackage.ia1
    public void d(v91 v91Var, ryb rybVar) {
        FirebasePerfOkHttpClient.a(rybVar, (ke9) this.c, this.a, ((oye) this.d).b());
        ((ia1) this.b).d(v91Var, rybVar);
    }

    public void e(boolean z) {
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            cge cgeVar = (cge) entry.getKey();
            bhe bheVar = (bhe) entry.getValue();
            int i = 1;
            boolean z2 = z && ((HashMap) this.d).containsKey(cgeVar);
            bheVar.c.removeCallbacks(bheVar.m);
            bheVar.k = false;
            bheVar.j = 1000L;
            Set setKeySet = bheVar.g.keySet();
            setKeySet.getClass();
            for (TarotSkinIdentify tarotSkinIdentify : s72.j1(setKeySet)) {
                bheVar.d.remove(tarotSkinIdentify);
                bheVar.f.remove(tarotSkinIdentify);
            }
            bheVar.g.clear();
            bheVar.f.keySet().retainAll(bheVar.d.c);
            bheVar.e.clear();
            ihe iheVar = bheVar.a;
            if (iheVar != null && !iheVar.g) {
                Handler handler = nhe.a;
                nhe.a.removeCallbacksAndMessages(iheVar.c);
                nhe.a(iheVar.c, new ghe(iheVar, i));
            }
            if (z2) {
                Set setKeySet2 = bheVar.h.keySet();
                if (!(setKeySet2 instanceof Collection) || !setKeySet2.isEmpty()) {
                    Iterator it = setKeySet2.iterator();
                    while (it.hasNext()) {
                        if (!bheVar.d.containsKey((TarotSkinIdentify) it.next())) {
                            bheVar.e();
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fe A[PHI: r7 r16 r17
  0x00fe: PHI (r7v1 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r16v5 v2h) = (r16v7 v2h), (r16v11 v2h) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public v2h f(String str, v2h v2hVar) throws Throwable {
        Cursor cursor;
        v2h v2hVar2;
        long j;
        Cursor cursorRawQuery;
        Pair pair;
        Object obj;
        Pair pair2;
        String strW = v2hVar.w();
        List listT = v2hVar.t();
        fmg fmgVar = (fmg) this.d;
        ich ichVar = fmgVar.c;
        w3h w3hVar = (w3h) fmgVar.b;
        ichVar.k0();
        e3h e3hVarK0 = lch.K0("_eid", v2hVar);
        Long l = (Long) (e3hVarK0 == null ? null : lch.S0(e3hVarK0));
        if (l != null) {
            if (strW.equals("_ep")) {
                ichVar.k0();
                e3h e3hVarK1 = lch.K0("_en", v2hVar);
                String str2 = (String) (e3hVarK1 == null ? null : lch.S0(e3hVarK1));
                if (TextUtils.isEmpty(str2)) {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.v.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((v2h) this.b) == null || ((Long) this.c) == null || l.longValue() != ((Long) this.c).longValue()) {
                    krg krgVar = ichVar.c;
                    ich.S(krgVar);
                    w3h w3hVar2 = (w3h) krgVar.b;
                    krgVar.A0();
                    krgVar.B0();
                    try {
                        cursorRawQuery = krgVar.r1().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    v2hVar2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((v2h) ((t2h) lch.l1(v2h.H(), cursorRawQuery.getBlob(0))).e(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (IOException e2) {
                                            w0h w0hVar2 = w3hVar2.f;
                                            w3h.h(w0hVar2);
                                            j = 0;
                                            try {
                                                w0hVar2.g.d("Failed to merge main event. appId, eventId", w0h.E0(str), l, e2);
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                w0h w0hVar3 = w3hVar2.f;
                                                w3h.h(w0hVar3);
                                                w0hVar3.g.b(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                pair = v2hVar2;
                                                if (pair != 0) {
                                                }
                                                w0h w0hVar4 = w3hVar.f;
                                                w3h.h(w0hVar4);
                                                w0hVar4.v.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                                return v2hVar2;
                                            }
                                            cursorRawQuery.close();
                                            pair = v2hVar2;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        j = 0;
                                        w0h w0hVar5 = w3hVar2.f;
                                        w3h.h(w0hVar5);
                                        w0hVar5.g.b(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pair = v2hVar2;
                                    }
                                } else {
                                    w0h w0hVar6 = w3hVar2.f;
                                    w3h.h(w0hVar6);
                                    w0hVar6.Z.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    v2hVar2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            v2hVar2 = null;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        v2hVar2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        w0h w0hVar7 = w3hVar.f;
                        w3h.h(w0hVar7);
                        w0hVar7.v.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return v2hVar2;
                    }
                    this.b = (v2h) obj;
                    this.a = ((Long) pair.second).longValue();
                    ichVar.k0();
                    this.c = (Long) lch.M0("_eid", (v2h) this.b);
                } else {
                    j = 0;
                }
                long j2 = this.a - 1;
                this.a = j2;
                if (j2 <= j) {
                    krg krgVar2 = ichVar.c;
                    ich.S(krgVar2);
                    w3h w3hVar3 = (w3h) krgVar2.b;
                    krgVar2.A0();
                    w0h w0hVar8 = w3hVar3.f;
                    w3h.h(w0hVar8);
                    w0hVar8.Z.b(str, "Clearing complex main event info. appId");
                    try {
                        krgVar2.r1().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e7) {
                        w0h w0hVar9 = w3hVar3.f;
                        w3h.h(w0hVar9);
                        w0hVar9.g.b(e7, "Error clearing complex main event");
                    }
                } else {
                    krg krgVar3 = ichVar.c;
                    ich.S(krgVar3);
                    krgVar3.S0(str, l, this.a, (v2h) this.b);
                }
                ArrayList arrayList = new ArrayList();
                for (e3h e3hVar : ((v2h) this.b).t()) {
                    ichVar.k0();
                    if (lch.K0(e3hVar.s(), v2hVar) == null) {
                        arrayList.add(e3hVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    w0h w0hVar10 = w3hVar.f;
                    w3h.h(w0hVar10);
                    w0hVar10.v.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listT);
                    listT = arrayList;
                }
                strW = str2;
            } else {
                this.c = l;
                this.b = v2hVar;
                ichVar.k0();
                e3h e3hVarK2 = lch.K0("_epc", v2hVar);
                Serializable serializableS0 = e3hVarK2 != null ? lch.S0(e3hVarK2) : null;
                long jLongValue = ((Long) (serializableS0 != null ? serializableS0 : 0L)).longValue();
                this.a = jLongValue;
                if (jLongValue <= 0) {
                    w0h w0hVar11 = w3hVar.f;
                    w3h.h(w0hVar11);
                    w0hVar11.v.b(strW, "Complex event with zero extra param count. eventName");
                } else {
                    krg krgVar4 = ichVar.c;
                    ich.S(krgVar4);
                    krgVar4.S0(str, l, this.a, v2hVar);
                }
            }
        }
        t2h t2hVar = (t2h) v2hVar.i();
        t2hVar.o(strW);
        t2hVar.c();
        ((v2h) t2hVar.b).L();
        t2hVar.c();
        ((v2h) t2hVar.b).K(listT);
        return (v2h) t2hVar.e();
    }

    @Override // defpackage.ia1
    public void h(v91 v91Var, IOException iOException) {
        ke9 ke9Var = (ke9) this.c;
        btb btbVar = ((cib) v91Var).b;
        if (btbVar != null) {
            ct6 ct6Var = btbVar.a;
            if (ct6Var != null) {
                ke9Var.j(ct6Var.k().toString());
            }
            String str = btbVar.b;
            if (str != null) {
                ke9Var.c(str);
            }
        }
        ke9Var.f(this.a);
        ub3.t((oye) this.d, ke9Var, ke9Var);
        ((ia1) this.b).h(v91Var, iOException);
    }

    public /* synthetic */ ws4(fmg fmgVar) {
        this.d = fmgVar;
    }

    public ws4(use useVar, j09 j09Var, long j, h0e h0eVar) {
        this.b = useVar;
        this.c = j09Var;
        this.a = j;
        this.d = h0eVar;
    }

    public ws4(kle kleVar) {
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = kleVar.d();
        this.c = new s94(1, this, ks0.l(new StringBuilder(), keg.b, " ConnectionPool connection closer"));
        this.d = new ConcurrentLinkedQueue();
    }

    public ws4(ia1 ia1Var, e4f e4fVar, oye oyeVar, long j) {
        this.b = ia1Var;
        this.c = new ke9(e4fVar);
        this.a = j;
        this.d = oyeVar;
    }

    public ws4(dxc dxcVar) {
        this.b = dxcVar;
        this.c = new LinkedHashMap(4, 0.75f, true);
        this.d = new HashMap();
    }
}
