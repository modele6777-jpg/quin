package defpackage;

import ai.askquin.R;
import ai.askquin.ui.account.component.AuthOption;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.replay.capture.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bm8 {
    public static final n82 A;
    public static final n82 B;
    public static final n82 C;
    public static final n82 D;
    public static final n82 E;
    public static final n82 F;
    public static final n82 G;
    public static final n82 H;
    public static final q9f I;
    public static final float J;
    public static final n82 K;
    public static final q9f L;
    public static final float M;
    public static final float N;
    public static final Object O;
    public static volatile r8h P;
    public static volatile r8h Q;
    public static gx6 R;
    public static final dd2 a = new dd2(new kd2(19), false, 135045201);
    public static final dd2 b = new dd2(new de2(1), false, 449479729);
    public static final dd2 c = new dd2(new he2(11), false, 364766442);
    public static final n82 d;
    public static final g5d e;
    public static final n82 f;
    public static final n82 g;
    public static final n82 h;
    public static final n82 i;
    public static final n82 j;
    public static final n82 k;
    public static final n82 l;
    public static final n82 m;
    public static final n82 n;
    public static final n82 o;
    public static final n82 p;
    public static final n82 q;
    public static final n82 r;
    public static final n82 s;
    public static final n82 t;
    public static final n82 u;
    public static final n82 v;
    public static final n82 w;
    public static final n82 x;
    public static final n82 y;
    public static final n82 z;

    static {
        n82 n82Var = n82.z;
        d = n82Var;
        e = g5d.b;
        n82 n82Var2 = n82.v;
        f = n82Var2;
        g = n82Var2;
        h = n82Var2;
        i = n82Var2;
        j = n82Var2;
        k = n82Var2;
        n82 n82Var3 = n82.a;
        l = n82Var3;
        m = n82Var2;
        n = n82Var3;
        n82 n82Var4 = n82.w;
        o = n82Var4;
        p = n82Var3;
        q = n82Var3;
        r = n82Var3;
        s = n82Var2;
        t = n82Var;
        u = n82Var4;
        v = n82Var;
        w = n82Var4;
        x = n82Var4;
        y = n82Var2;
        z = n82Var4;
        A = n82Var4;
        B = n82Var4;
        C = n82Var4;
        D = n82Var4;
        E = n82.x;
        F = n82Var4;
        G = n82Var4;
        H = n82.c;
        I = q9f.e;
        J = 6.0f;
        K = n82.b;
        L = q9f.b;
        M = 48.0f;
        N = 68.0f;
        O = new Object();
    }

    public static Object A(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object B(Map map, Object obj) {
        map.getClass();
        if (map instanceof xl8) {
            return ((xl8) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static tx6 C(Object obj) {
        return obj == null ? tx6.c : new tx6(0, obj);
    }

    public static boolean D(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static int E(ByteBuffer byteBuffer) {
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            byte b2 = byteBuffer.get();
            i2 |= (b2 & 127) << (i3 * 7);
            if ((b2 & 128) == 0) {
                return i2;
            }
        }
        return i2;
    }

    public static int F(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map G(iy9 iy9Var) {
        iy9Var.getClass();
        Map mapSingletonMap = Collections.singletonMap(iy9Var.d(), iy9Var.e());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Map H(iy9... iy9VarArr) {
        if (iy9VarArr.length <= 0) {
            return qu4.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F(iy9VarArr.length));
        O(linkedHashMap, iy9VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap I(iy9... iy9VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(F(iy9VarArr.length));
        O(linkedHashMap, iy9VarArr);
        return linkedHashMap;
    }

    public static m88 J(m88 m88Var) {
        m88Var.getClass();
        if (m88Var.isDone()) {
            return m88Var;
        }
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            N(false, m88Var, la1Var, g94.a());
            la1Var.a = "nonCancellationPropagating[" + m88Var + "]";
        } catch (Exception e2) {
            pa1Var.a(e2);
        }
        return pa1Var;
    }

    public static final Map K(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return qu4.a;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap L(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map M(Map map, iy9 iy9Var) {
        map.getClass();
        if (map.isEmpty()) {
            return G(iy9Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(iy9Var.d(), iy9Var.e());
        return linkedHashMap;
    }

    public static void N(boolean z2, m88 m88Var, la1 la1Var, g94 g94Var) {
        m88Var.getClass();
        la1Var.getClass();
        g94Var.getClass();
        int i2 = 0;
        m88Var.b(new w36(i2, m88Var, new mjg(la1Var)), g94Var);
        if (z2) {
            la1Var.a(new u36(m88Var, i2), g94.a());
        }
    }

    public static void O(Map map, iy9[] iy9VarArr) {
        for (iy9 iy9Var : iy9VarArr) {
            map.put(iy9Var.a(), iy9Var.b());
        }
    }

    public static Object P(l26 l26Var) {
        return z5c.I(nu4.a, l26Var);
    }

    public static ArrayList Q(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i2 = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iE = ((b2 >> 1) & 1) != 0 ? E(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iE > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position());
                ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate2.limit(byteBufferAsReadOnlyBuffer.position() + iE);
                arrayList.add(new el9(i2, byteBufferDuplicate2));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iE);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static final int R(p69 p69Var) {
        int iA;
        int i2 = p69Var.b;
        int iA2 = p69Var.a(0);
        while (p69Var.b != 0 && p69Var.a(0) == iA2) {
            p69Var.f(0, p69Var.b());
            p69Var.e(p69Var.b - 1);
            int i3 = p69Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iA3 = p69Var.a(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iA4 = p69Var.a(i7);
                if (i6 < i3 && (iA = p69Var.a(i6)) > iA4) {
                    if (iA <= iA3) {
                        break;
                    }
                    p69Var.f(i5, iA);
                    p69Var.f(i6, iA3);
                    i5 = i6;
                } else {
                    if (iA4 <= iA3) {
                        break;
                    }
                    p69Var.f(i5, iA4);
                    p69Var.f(i7, iA3);
                    i5 = i7;
                }
            }
        }
        return iA2;
    }

    public static byte[] S(bb3 bb3Var) {
        bb3Var.getClass();
        HashMap map = bb3Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    T(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e2) {
            ff8.h().g(rd3.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void T(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                v.a(job.a.b(obj.getClass()).r(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            kob kobVar = job.a;
            em7 em7VarB = kobVar.b(cls);
            if (em7VarB.equals(kobVar.b(Boolean[].class))) {
                i2 = 8;
            } else if (em7VarB.equals(kobVar.b(Byte[].class))) {
                i2 = 9;
            } else if (em7VarB.equals(kobVar.b(Integer[].class))) {
                i2 = 10;
            } else if (em7VarB.equals(kobVar.b(Long[].class))) {
                i2 = 11;
            } else if (em7VarB.equals(kobVar.b(Float[].class))) {
                i2 = 12;
            } else if (em7VarB.equals(kobVar.b(Double[].class))) {
                i2 = 13;
            } else {
                if (!em7VarB.equals(kobVar.b(String[].class))) {
                    v.a(kobVar.b(objArr.getClass()).g(), "Unsupported value type ");
                    return;
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l2 != null ? l2.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i2 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i2 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final long U(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        if (i2 <= 15) {
            return j2;
        }
        if (i2 == s82.u.c) {
            return abg.Z(j2);
        }
        if ((i2 == s82.v.c || i2 == s82.w.c) && Build.VERSION.SDK_INT < 34) {
            return abg.Z(j2);
        }
        return (i2 != s82.x.c || Build.VERSION.SDK_INT >= 36) ? (j2 & (-64)) | (j3 - 1) : abg.Z(j2);
    }

    public static String V(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (D(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (D(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static Map W(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return qu4.a;
        }
        if (size == 1) {
            return G((iy9) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iy9 iy9Var = (iy9) it.next();
            linkedHashMap.put(iy9Var.a(), iy9Var.b());
        }
        return linkedHashMap;
    }

    public static Map X(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return qu4.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap Y(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static final me9 Z(ryb rybVar) {
        v41 v41VarP0;
        int i2 = rybVar.d;
        long j2 = rybVar.z;
        long j3 = rybVar.X;
        si6 si6Var = rybVar.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = si6Var.iterator();
        while (true) {
            l2 l2Var = (l2) it;
            if (!l2Var.hasNext()) {
                break;
            }
            iy9 iy9Var = (iy9) l2Var.next();
            String str = (String) iy9Var.a();
            String str2 = (String) iy9Var.b();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        xd9 xd9Var = new xd9(X(linkedHashMap));
        vyb vybVar = rybVar.g;
        return new me9(i2, j2, j3, xd9Var, (vybVar == null || (v41VarP0 = vybVar.P0()) == null) ? null : new utd(v41VarP0), rybVar);
    }

    public static final void a(b4a b4aVar, Integer num, int i2, l46 l46Var, int i3) {
        l46 l46Var2;
        i82 i82Var;
        Object obj;
        long j2;
        int i4;
        String strR;
        l46Var.h0(775439245);
        int i5 = (i3 & 6) == 0 ? ((i3 & 8) == 0 ? l46Var.g(b4aVar) : l46Var.i(b4aVar) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i5 |= l46Var.g(num) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= l46Var.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i6 = 0;
        if (l46Var.W(i5 & 1, (i5 & 147) != 146)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            boolean zH = l46Var.h(zF);
            Object objR = l46Var.R();
            if (zH || objR == sf2.a) {
                if (zF) {
                    float[] fArrX = feg.x();
                    feg.T(fArrX);
                    i82 i82Var2 = new i82(new ColorMatrixColorFilter(fArrX));
                    i82Var2.b = fArrX;
                    i82Var = i82Var2;
                } else {
                    i82Var = null;
                }
                l46Var.p0(i82Var);
                obj = i82Var;
            }
            obj = objR;
            c82 c82Var = (c82) obj;
            j09 j09VarP = pa7.p(b.c(g09.a, 1.0f), b4aVar.c ? 1.0f : 0.3f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i6)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarP);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            String strQ = afc.q(b4aVar.a, l46Var);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.p(l46Var), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183);
            if (zF) {
                l46Var.f0(-431810991);
                j2 = ((e8b) l46Var.k(pr4Var)).q;
            } else {
                l46Var.f0(-431810128);
                j2 = ((e8b) l46Var.k(pr4Var)).u;
            }
            l46Var.r(false);
            nte.b(strQ, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131066);
            l46 l46Var3 = l46Var;
            l46Var3.f0(-431808365);
            for (a4a a4aVar : b4aVar.b) {
                int iB = zF ? a4aVar.b() : a4aVar.a();
                int iOrdinal = a4aVar.ordinal();
                if (iOrdinal == 1) {
                    i4 = 0;
                    l46Var3.f0(86236123);
                    strR = afc.r(a4aVar.c(), new Object[]{Integer.valueOf(num != null ? num.intValue() : 5)}, l46Var3);
                    l46Var3.r(false);
                } else if (iOrdinal != 7) {
                    l46Var3.f0(86240899);
                    strR = afc.q(a4aVar.c(), l46Var3);
                    i4 = 0;
                    l46Var3.r(false);
                } else {
                    i4 = 0;
                    l46Var3.f0(86238899);
                    strR = afc.r(a4aVar.c(), new Object[]{Integer.valueOf(i2)}, l46Var3);
                    l46Var3.r(false);
                }
                b(iB, strR, a4aVar.a() == R.drawable.ic_friend_coupon_benefit ? c82Var : null, l46Var3, i4);
            }
            l46Var3.r(false);
            l46Var3.r(true);
            l46Var2 = l46Var3;
        } else {
            l46 l46Var4 = l46Var;
            l46Var4.Z();
            l46Var2 = l46Var4;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(b4aVar, num, i2, i3, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final btb a0(ae9 ae9Var, zn2 zn2Var) {
        aa1 aa1Var;
        zsb zsbVar;
        ae9 ae9Var2;
        String str;
        zsb zsbVar2;
        if (zn2Var instanceof aa1) {
            aa1Var = (aa1) zn2Var;
            int i2 = aa1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aa1Var.label = i2 - Integer.MIN_VALUE;
            } else {
                aa1Var = new aa1(zn2Var);
            }
        } else {
            aa1Var = new aa1(zn2Var);
        }
        Object obj = aa1Var.result;
        int i3 = aa1Var.label;
        dtb dtbVar = null;
        if (i3 == 0) {
            jzb.q(obj);
            zsbVar = new zsb();
            zsbVar.c(ae9Var.a);
            ae9Var2 = ae9Var;
            str = ae9Var.b;
            zsbVar2 = zsbVar;
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) aa1Var.L$3;
            zsbVar = (zsb) aa1Var.L$2;
            zsbVar2 = (zsb) aa1Var.L$1;
            ae9Var2 = (ae9) aa1Var.L$0;
            jzb.q(obj);
            a71 a71Var = (a71) obj;
            if (a71Var != null) {
                int i4 = ftb.a;
                dtbVar = new dtb(a71Var);
            }
        }
        zsbVar.b(str, dtbVar);
        xd9 xd9Var = ae9Var2.c;
        ArrayList arrayList = new ArrayList(20);
        for (Map.Entry entry : xd9Var.a.entrySet()) {
            String str2 = (String) entry.getKey();
            for (String str3 : (List) entry.getValue()) {
                str2.getClass();
                str3.getClass();
                xdc.p(str2);
                arrayList.add(str2);
                arrayList.add(v4e.o0(str3).toString());
            }
        }
        si6 si6Var = new si6((String[]) arrayList.toArray(new String[0]));
        zsbVar2.getClass();
        zsbVar2.c = xdc.j(si6Var);
        return new btb(zsbVar2);
    }

    public static final void b(int i2, String str, c82 c82Var, l46 l46Var, int i3) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-524079193);
        int i4 = i3 | (l46Var2.e(i2) ? 4 : 2) | (l46Var2.g(str) ? 32 : 16) | (l46Var2.g(c82Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i5 = 0;
        if (l46Var2.W(i4 & 1, (i4 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(i5)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            feg.j(od4.A(i2, i4 & 14, l46Var2), null, b.l(g09Var, 24.0f), null, null, 0.0f, c82Var, l46Var2, 440 | ((i4 << 12) & 3670016), 56);
            mue mueVar = oue.a;
            nte.b(str, new jw7(1.0f, true), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var, (i4 >> 3) & 14, 0, 131064);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(i2, str, c82Var, i3);
        }
    }

    public static final long b0(long j2) {
        int i2 = (int) (63 & j2);
        return (i2 == s82.x.c || i2 == s82.s.c || i2 == s82.t.c) ? U(y72.a(j2, s82.e)) : U(j2);
    }

    public static final void c(final String str, final AuthOption authOption, final boolean z2, final long j2, final x16 x16Var, final x16 x16Var2, final a26 a26Var, final j09 j09Var, l46 l46Var, final int i2) {
        boolean z3;
        String strI;
        l46 l46Var2 = l46Var;
        str.getClass();
        authOption.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        a26Var.getClass();
        l46Var2.h0(898920520);
        int i3 = i2 | (l46Var2.g(str) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.e(authOption.ordinal()) ? 32 : 16;
        }
        int i4 = i3 | (l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.f(j2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(x16Var2) ? 131072 : 65536) | (l46Var2.i(a26Var) ? 1048576 : 524288);
        if (l46Var2.W(i4 & 1, (4793491 & i4) != 4793490)) {
            jx0 jx0Var = ndb.Z;
            c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            g09 g09Var = g09.a;
            j09 j09VarE = kv2.e(g09Var, 40.0f, l46Var2, g09Var, 1.0f);
            l46Var2.f0(-1225934584);
            i00 i00Var = new i00();
            int i5 = v62.a[authOption.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                l46Var2.f0(1313202858);
                l46Var2.r(false);
            } else if (i5 == 4) {
                l46Var2.f0(1313204033);
                i00Var.f(afc.q(R.string.auth_login_code_email_tips, l46Var2));
                l46Var2.r(false);
            } else {
                if (i5 != 5) {
                    throw tec.d(1313200351, l46Var2, false);
                }
                l46Var2.f0(1313206913);
                i00Var.f(afc.q(R.string.auth_login_code_phone_tips, l46Var2));
                l46Var2.r(false);
            }
            i00Var.f(" ");
            int iK = i00Var.k(new xtd(0L, 0L, ar5.z, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                i00Var.f(str);
                i00Var.h(iK);
                k00 k00VarL = i00Var.l();
                l46Var2.r(false);
                nte.c(k00VarL, j09VarE, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, new mue(0L, w6c.l(14), ar5.w, null, ((y8b) l46Var2.k(x8b.a)).b, 0L, 0L, 3, 0, w6c.l(20), null, null, 16613337), l46Var, 48, 0, 262140);
                j09 j09VarB0 = ynb.b0(0.0f, 32.0f, new mq6(jx0Var), 1);
                boolean z4 = (3670016 & i4) == 1048576;
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (z4 || objR == i8cVar) {
                    objR = new hy0(a26Var, 5);
                    l46Var.p0(objR);
                }
                d8c.a(0, z2, j09VarB0, x16Var, (a26) objR, l46Var, (i4 >> 3) & 7280);
                if (j2 > 0) {
                    l46Var.f0(651501525);
                    strI = afc.r(R.string.auth_resend_code_with_duration, new Object[]{Long.valueOf(j2)}, l46Var);
                    z3 = false;
                    l46Var.r(false);
                } else {
                    z3 = false;
                    strI = tec.i(l46Var, 651596757, R.string.auth_resend_code, l46Var, false);
                }
                boolean z5 = j2 <= 0 ? true : z3;
                boolean z6 = (i4 & 458752) == 131072 ? true : z3;
                Object objR2 = l46Var.R();
                if (z6 || objR2 == i8cVar) {
                    objR2 = new c20(8, x16Var2);
                    l46Var.p0(objR2);
                }
                nte.b(strI, androidx.compose.foundation.b.c(g09Var, z5, null, null, (x16) objR2, 14), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262140);
                l46Var2 = l46Var;
                l46Var2.r(true);
            } catch (Throwable th) {
                i00Var.h(iK);
                throw th;
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: u62
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bm8.c(str, authOption, z2, j2, x16Var, x16Var2, a26Var, j09Var, (l46) obj, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static String c0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final void d(j09 j09Var, nh4 nh4Var, l46 l46Var, int i2) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1528001442);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var2.g(j09Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var2.g(nh4Var) : l46Var2.i(nh4Var) ? 32 : 16;
        }
        int i4 = 0;
        int i5 = 1;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.annual_domain_fortune_summary, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            g09 g09Var = g09.a;
            d8c.b(b.r(b.c(g09Var, 1.0f)), null, null, af1.b0(-1528929655, new jh4(nh4Var, i5), l46Var2), l46Var2, 3078, 6);
            d8c.b(dj6.w(b.c(g09Var, 1.0f), 1.0f), null, new bx9(16.0f, 16.0f, 16.0f, 16.0f), af1.b0(-1111932302, new jh4(nh4Var, 2), l46Var2), l46Var2, 3462, 2);
            d8c.b(b.r(b.c(g09Var, 1.0f)), null, new bx9(20.0f, 20.0f, 20.0f, 20.0f), af1.b0(-875762479, new jh4(nh4Var, 3), l46Var2), l46Var2, 3462, 2);
            tec.u(g09Var, 12.0f, l46Var2, true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(j09Var, nh4Var, i2, 16);
        }
    }

    public static tv1 d0(m88 m88Var, tg0 tg0Var, Executor executor) {
        tv1 tv1Var = new tv1(tg0Var, m88Var);
        m88Var.b(tv1Var, executor);
        return tv1Var;
    }

    public static final void e(x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var2.h0(-1280734165);
        int i3 = i2 | (l46Var2.i(x16Var) ? 4 : 2) | (l46Var2.i(x16Var2) ? 32 : 16) | (l46Var2.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            e89 e89VarT = tm7.t(((bi4) z5c.G(job.a.b(bi4.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), null)).c, l46Var2);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR);
            }
            e89 e89Var = (e89) objR;
            oh4 oh4Var = (oh4) e89VarT.getValue();
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = new ok3(e89Var, 9);
                l46Var2.p0(objR2);
            }
            int i5 = i3 << 3;
            f(oh4Var, x16Var, x16Var2, x16Var3, (x16) objR2, l46Var2, (i5 & 112) | 24584 | (i5 & 896) | (i5 & 7168));
            l46Var2 = l46Var2;
            oh4 oh4Var2 = (oh4) e89VarT.getValue();
            nh4 nh4Var = oh4Var2 instanceof nh4 ? (nh4) oh4Var2 : null;
            if (nh4Var != null) {
                l46Var2.f0(2138562323);
                boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                Object objR3 = l46Var2.R();
                if (objR3 == i8cVar) {
                    objR3 = new ok3(e89Var, 10);
                    l46Var2.p0(objR3);
                }
                od4.a(3504, af1.b0(-2127275005, new jh4(nh4Var, i4), l46Var2), (x16) objR3, l46Var2, "annual-domain-summary-share", zBooleanValue);
                l46Var2.r(false);
            } else {
                l46Var2.f0(2138842935);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new n20(x16Var, x16Var2, x16Var3, i2, 1);
        }
    }

    public static o8f e0(o8f o8fVar) {
        int i2 = 0;
        if (!(o8fVar instanceof m17)) {
            return new dp1(o8fVar, i2);
        }
        m17 m17Var = (m17) o8fVar;
        c8f[] c8fVarArr = m17Var.b;
        ArrayList<iy9> arrayListK0 = qd0.K0(m17Var.c, c8fVarArr);
        ArrayList arrayList = new ArrayList(t72.u(arrayListK0, 10));
        for (iy9 iy9Var : arrayListK0) {
            arrayList.add(t((i8f) iy9Var.d(), (c8f) iy9Var.e()));
        }
        return new m17(c8fVarArr, (i8f[]) arrayList.toArray(new i8f[0]), true);
    }

    public static final void f(oh4 oh4Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, l46 l46Var, int i2) {
        int i3;
        oh4 oh4Var2;
        x16 x16Var5;
        x16 x16Var6;
        x16 x16Var7;
        x16 x16Var8;
        l46 l46Var2;
        l46Var.h0(254292485);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(oh4Var) : l46Var.i(oh4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(x16Var4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            FillElement fillElement = b.c;
            x16Var5 = x16Var;
            oh4Var2 = oh4Var;
            x16Var8 = x16Var4;
            x16Var6 = x16Var2;
            x16Var7 = x16Var3;
            dd2 dd2VarB0 = af1.b0(-274682968, new n50(x16Var, (Object) oh4Var, x16Var4, x16Var2, (m26) x16Var3, 4), l46Var);
            l46Var2 = l46Var;
            rs0.f(fillElement, false, dd2VarB0, l46Var2, 390, 2);
        } else {
            oh4Var2 = oh4Var;
            x16Var5 = x16Var;
            x16Var6 = x16Var2;
            x16Var7 = x16Var3;
            x16Var8 = x16Var4;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb((Object) oh4Var2, x16Var5, (m26) x16Var6, (m26) x16Var7, (m26) x16Var8, i2, 6);
        }
    }

    public static final void g(j09 j09Var, long j2, int i2, a26 a26Var, l46 l46Var, int i3) {
        l46 l46Var2;
        long j3;
        mue mueVarG;
        boolean z2;
        int i4;
        s69 s69Var;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        a26Var.getClass();
        l46Var3.h0(-2019319556);
        int i5 = i3 | 48 | (l46Var3.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var3.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var3.W(i5 & 1, (i5 & 1171) != 1170)) {
            long jD = abg.d(4285820151L);
            int i6 = i5 & 896;
            boolean z3 = i6 == 256;
            Object objR = l46Var3.R();
            i8c i8cVar = sf2.a;
            if (z3 || objR == i8cVar) {
                objR = kv2.f(i2 - 1, l46Var3);
            }
            s69 s69Var2 = (s69) objR;
            boolean z4 = i6 == 256;
            Object objR2 = l46Var3.R();
            if (z4 || objR2 == i8cVar) {
                objR2 = Float.valueOf(mh3.n(((i2 / 5.0f) * 0.8f) + 0.2f, 0.0f, 1.0f));
                l46Var3.p0(objR2);
            }
            float fFloatValue = ((Number) objR2).floatValue();
            long jB = y72.b(jD, 0.5f);
            gh6 gh6VarW0 = kj0.w0(l46Var3);
            int i7 = i5;
            long jB2 = y72.b(jD, fFloatValue);
            xn8 xn8VarC = s21.c(ndb.b, false);
            long j4 = jB;
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09Var);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z5 = l46Var3.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z5) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, xn8VarC);
            dec.l(he2Var3, l46Var3, u8aVarM);
            ib8.s(iHashCode, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ);
            g09 g09Var = g09.a;
            long j5 = jB2;
            s21.a(tm7.o(oa7.E(b.d(b.c(g09Var, 1.0f), 42.0f), a7c.a()), y72.b(jD, 0.3f), g21.f), l46Var3, 0);
            jx0 jx0Var = ndb.Y;
            sc0 sc0Var = xc0.c;
            c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var3, 0);
            int iHashCode2 = Long.hashCode(l46Var3.T);
            u8a u8aVarM2 = l46Var3.m();
            j09 j09VarJ2 = m93.J(l46Var3, g09Var);
            l46Var3.j0();
            sc0 sc0Var2 = sc0Var;
            if (l46Var3.S) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, c92VarA);
            dec.l(he2Var3, l46Var3, u8aVarM2);
            ib8.s(iHashCode2, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ2);
            j09 j09VarC = b.c(g09Var, 1.0f);
            kx0 kx0Var = ndb.y;
            rc0 rc0Var = xc0.a;
            t7c t7cVarA = s7c.a(rc0Var, kx0Var, l46Var3, 48);
            int iHashCode3 = Long.hashCode(l46Var3.T);
            u8a u8aVarM3 = l46Var3.m();
            j09 j09VarJ3 = m93.J(l46Var3, j09VarC);
            l46Var3.j0();
            long j6 = jD;
            if (l46Var3.S) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, t7cVarA);
            dec.l(he2Var3, l46Var3, u8aVarM3);
            ib8.s(iHashCode3, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ3);
            l46Var3.f0(554310717);
            int i8 = 0;
            while (i8 < 5) {
                boolean z6 = ((sz9) s69Var2).j() == i8;
                j09 j09VarD = b.d(g09Var, 42.0f).D(new jw7(1.0f, true));
                xn8 xn8VarC2 = s21.c(ndb.f, false);
                rc0 rc0Var2 = rc0Var;
                int iHashCode4 = Long.hashCode(l46Var3.T);
                u8a u8aVarM4 = l46Var3.m();
                j09 j09VarJ4 = m93.J(l46Var3, j09VarD);
                lf2.q.getClass();
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var4, l46Var3, xn8VarC2);
                dec.l(he2Var3, l46Var3, u8aVarM4);
                ib8.s(iHashCode4, l46Var3, he2Var2, l46Var3);
                dec.l(he2Var, l46Var3, j09VarJ4);
                Object objR3 = l46Var3.R();
                if (objR3 == i8cVar) {
                    objR3 = new l89(null);
                    l46Var3.p0(objR3);
                }
                l89 l89Var = (l89) objR3;
                l89Var.c.b(8, z6);
                final long j7 = j5;
                final long j8 = j4;
                boolean zF = l46Var3.f(j7) | l46Var3.f(j8);
                Object objR4 = l46Var3.R();
                if (zF || objR4 == i8cVar) {
                    objR4 = new p5e() { // from class: o25
                        @Override // defpackage.p5e
                        public final void a(rxb rxbVar) {
                            rxbVar.getClass();
                            rxbVar.j(a7c.a);
                            n3d.r(rxbVar, 16.0f);
                            rxbVar.b(j8);
                            dw dwVar = new dw(rxbVar, j7, 2);
                            z5e z5eVar = rxbVar.b;
                            z5eVar.getClass();
                            if (z5eVar.N0.c.a(8)) {
                                dwVar.invoke();
                            }
                        }
                    };
                    l46Var3.p0(objR4);
                }
                j09 j09VarE = oa7.E(aic.q(g09Var, l89Var, (p5e) objR4), a7c.a);
                i7 = i7;
                j4 = j8;
                boolean zE = l46Var3.e(i8) | l46Var3.g(s69Var2) | l46Var3.i(gh6VarW0) | ((i7 & 7168) == 2048);
                Object objR5 = l46Var3.R();
                if (zE || objR5 == i8cVar) {
                    s69 s69Var3 = s69Var2;
                    z2 = true;
                    j5 = j7;
                    i4 = 0;
                    bl blVar = new bl(i8, gh6VarW0, a26Var, s69Var3, 3);
                    s69Var = s69Var3;
                    l46Var3.p0(blVar);
                    objR5 = blVar;
                } else {
                    s69Var = s69Var2;
                    i4 = 0;
                    z2 = true;
                    j5 = j7;
                }
                s21.a(androidx.compose.foundation.b.c(j09VarE, false, null, null, (x16) objR5, 15), l46Var3, i4);
                l46Var3.r(z2);
                i8++;
                ov7Var = ov7Var;
                sc0Var2 = sc0Var2;
                rc0Var = rc0Var2;
                i8cVar = i8cVar;
                j6 = j6;
                s69Var2 = s69Var;
            }
            int i9 = 5;
            rc0 rc0Var3 = rc0Var;
            ov7 ov7Var2 = ov7Var;
            s69 s69Var4 = s69Var2;
            sc0 sc0Var3 = sc0Var2;
            long j9 = j6;
            boolean z7 = false;
            boolean z8 = true;
            l46Var3.r(false);
            l46Var3.r(true);
            j09 j09VarB = b.b(0.0f, 42.0f, b.c(g09Var, 1.0f), 1);
            t7c t7cVarA2 = s7c.a(rc0Var3, ndb.z, l46Var3, 48);
            int iHashCode5 = Long.hashCode(l46Var3.T);
            u8a u8aVarM5 = l46Var3.m();
            j09 j09VarJ5 = m93.J(l46Var3, j09VarB);
            lf2.q.getClass();
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(ov7Var2);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, t7cVarA2);
            dec.l(he2Var3, l46Var3, u8aVarM5);
            ib8.s(iHashCode5, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ5);
            l46Var3.f0(811416931);
            int i10 = 0;
            while (i10 < i9) {
                boolean z9 = ((sz9) s69Var4).j() == i10 ? z8 : z7;
                jw7 jw7Var = new jw7(1.0f, z8);
                c92 c92VarA2 = a92.a(sc0Var3, ndb.Z, l46Var3, 54);
                boolean z10 = z9;
                int iHashCode6 = Long.hashCode(l46Var3.T);
                u8a u8aVarM6 = l46Var3.m();
                j09 j09VarJ6 = m93.J(l46Var3, jw7Var);
                lf2.q.getClass();
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var2);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var4, l46Var3, c92VarA2);
                dec.l(he2Var3, l46Var3, u8aVarM6);
                ib8.s(iHashCode6, l46Var3, he2Var2, l46Var3);
                dec.l(he2Var, l46Var3, j09VarJ6);
                String str = afc.p(R.array.personality_rating_label, l46Var3)[i10];
                if (z10) {
                    l46Var3.f0(106566583);
                    mue mueVar = oue.a;
                    mueVarG = pue.f(l46Var3);
                } else {
                    l46Var3.f0(106567672);
                    mue mueVar2 = oue.a;
                    mueVarG = pue.g(l46Var3);
                }
                l46Var3.r(z7);
                boolean z11 = z8;
                l46 l46Var4 = l46Var3;
                nte.b(str, null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarG, l46Var4, 0, 0, 130046);
                l46Var4.r(z11);
                i10++;
                z8 = z11;
                l46Var3 = l46Var4;
                he2Var4 = he2Var4;
                i9 = 5;
                ov7Var2 = ov7Var2;
                sc0Var3 = sc0Var3;
                z7 = false;
            }
            l46Var2 = l46Var3;
            boolean z12 = z8;
            l46Var2.r(z7);
            l46Var2.r(z12);
            l46Var2.r(z12);
            l46Var2.r(z12);
            j3 = j9;
        } else {
            l46Var2 = l46Var3;
            l46Var2.Z();
            j3 = j2;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xb(j09Var, j3, i2, a26Var, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0152  */
    /* JADX WARN: Code duplicated, block: B:91:0x0160  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void h(x16 x16Var, j09 j09Var, boolean z2, cu6 cu6Var, x4d x4dVar, l26 l26Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        boolean z3;
        int i6;
        cu6 cu6Var2;
        int i7;
        boolean z4;
        x4d x4dVar2;
        j09 j09Var3;
        boolean z5;
        cu6 cu6Var3;
        ojb ojbVarV;
        j09 j09Var4;
        int i8;
        x4d x4dVarB;
        j09 j09Var5;
        long j2;
        m82 m82Var;
        cu6 cu6Var4;
        cu6 cu6VarA;
        int i9;
        int i10;
        float f2 = feg.j;
        l46Var.h0(1413012038);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z3 = z2;
                    if (l46Var.h(z3)) {
                        i6 = 256;
                    } else {
                        i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        cu6Var2 = cu6Var;
                        if (l46Var.g(cu6Var2)) {
                            i10 = 2048;
                        }
                        i4 |= i10;
                    } else {
                        cu6Var2 = cu6Var;
                    }
                    i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i4 |= i10;
                } else {
                    cu6Var2 = cu6Var;
                }
                i7 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    i7 = 90112 | i4;
                }
                if ((1572864 & i2) != 0) {
                    if (l46Var.i(l26Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i7 |= i9;
                }
                if ((599187 & i7) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i7 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i11 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            j2 = ((y72) l46Var.k(em2.a)).a;
                            m82Var = (m82) l46Var.k(o82.a);
                            cu6Var4 = m82Var.f0;
                            if (cu6Var4 == null) {
                                long j3 = y72.j;
                                cu6VarA = new cu6(j3, j2, j3, y72.b(j2, f2));
                                m82Var.f0 = cu6VarA;
                            } else {
                                cu6VarA = cu6Var4;
                            }
                            if (!faf.a(cu6VarA.b, j2)) {
                                cu6VarA = cu6VarA.a(cu6VarA.a, j2, cu6VarA.c, y72.b(j2, f2));
                            }
                            i7 &= -7169;
                            cu6Var2 = cu6VarA;
                        }
                        i8 = i7 & (-458753);
                        j09 j09Var6 = j09Var4;
                        x4dVarB = u5d.b(ym8.e, l46Var);
                        j09Var5 = j09Var6;
                    } else {
                        l46Var.Z();
                        if ((i3 & 8) != 0) {
                            i7 &= -7169;
                        }
                        x4dVarB = x4dVar;
                        i8 = i7 & (-458753);
                        j09Var5 = j09Var2;
                    }
                    boolean z6 = z3;
                    cu6Var3 = cu6Var2;
                    l46Var.s();
                    int i12 = i8 << 3;
                    i(j09Var5, x16Var, z6, x4dVarB, cu6Var3, l26Var, l46Var, ((i8 >> 3) & 14) | (i12 & 112) | (i8 & 896) | (57344 & i12) | (i12 & 458752) | (i8 & 3670016));
                    x4dVar2 = x4dVarB;
                    z5 = z6;
                    j09Var3 = j09Var5;
                } else {
                    l46Var.Z();
                    x4dVar2 = x4dVar;
                    j09Var3 = j09Var2;
                    z5 = z3;
                    cu6Var3 = cu6Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t42(x16Var, j09Var3, z5, cu6Var3, x4dVar2, l26Var, i2, i3);
                }
            }
            i4 |= 384;
            z3 = z2;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    cu6Var2 = cu6Var;
                    if (l46Var.g(cu6Var2)) {
                        i10 = 2048;
                    }
                    i4 |= i10;
                } else {
                    cu6Var2 = cu6Var;
                }
                i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i4 |= i10;
            } else {
                cu6Var2 = cu6Var;
            }
            i7 = i4 | 24576;
            if ((196608 & i2) == 0) {
                i7 = 90112 | i4;
            }
            if ((1572864 & i2) != 0) {
                if (l46Var.i(l26Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i7 |= i9;
            }
            if ((599187 & i7) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i7 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        j2 = ((y72) l46Var.k(em2.a)).a;
                        m82Var = (m82) l46Var.k(o82.a);
                        cu6Var4 = m82Var.f0;
                        if (cu6Var4 == null) {
                            long j4 = y72.j;
                            cu6VarA = new cu6(j4, j2, j4, y72.b(j2, f2));
                            m82Var.f0 = cu6VarA;
                        } else {
                            cu6VarA = cu6Var4;
                        }
                        if (!faf.a(cu6VarA.b, j2)) {
                            cu6VarA = cu6VarA.a(cu6VarA.a, j2, cu6VarA.c, y72.b(j2, f2));
                        }
                        i7 &= -7169;
                        cu6Var2 = cu6VarA;
                    }
                    i8 = i7 & (-458753);
                    j09 j09Var7 = j09Var4;
                    x4dVarB = u5d.b(ym8.e, l46Var);
                    j09Var5 = j09Var7;
                } else {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        j2 = ((y72) l46Var.k(em2.a)).a;
                        m82Var = (m82) l46Var.k(o82.a);
                        cu6Var4 = m82Var.f0;
                        if (cu6Var4 == null) {
                            long j5 = y72.j;
                            cu6VarA = new cu6(j5, j2, j5, y72.b(j2, f2));
                            m82Var.f0 = cu6VarA;
                        } else {
                            cu6VarA = cu6Var4;
                        }
                        if (!faf.a(cu6VarA.b, j2)) {
                            cu6VarA = cu6VarA.a(cu6VarA.a, j2, cu6VarA.c, y72.b(j2, f2));
                        }
                        i7 &= -7169;
                        cu6Var2 = cu6VarA;
                    }
                    i8 = i7 & (-458753);
                    j09 j09Var8 = j09Var4;
                    x4dVarB = u5d.b(ym8.e, l46Var);
                    j09Var5 = j09Var8;
                }
                boolean z7 = z3;
                cu6Var3 = cu6Var2;
                l46Var.s();
                int i13 = i8 << 3;
                i(j09Var5, x16Var, z7, x4dVarB, cu6Var3, l26Var, l46Var, ((i8 >> 3) & 14) | (i13 & 112) | (i8 & 896) | (57344 & i13) | (i13 & 458752) | (i8 & 3670016));
                x4dVar2 = x4dVarB;
                z5 = z7;
                j09Var3 = j09Var5;
            } else {
                l46Var.Z();
                x4dVar2 = x4dVar;
                j09Var3 = j09Var2;
                z5 = z3;
                cu6Var3 = cu6Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t42(x16Var, j09Var3, z5, cu6Var3, x4dVar2, l26Var, i2, i3);
            }
        }
        i4 |= 48;
        j09Var2 = j09Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z3 = z2;
                if (l46Var.h(z3)) {
                    i6 = 256;
                } else {
                    i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    cu6Var2 = cu6Var;
                    if (l46Var.g(cu6Var2)) {
                        i10 = 2048;
                    }
                    i4 |= i10;
                } else {
                    cu6Var2 = cu6Var;
                }
                i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i4 |= i10;
            } else {
                cu6Var2 = cu6Var;
            }
            i7 = i4 | 24576;
            if ((196608 & i2) == 0) {
                i7 = 90112 | i4;
            }
            if ((1572864 & i2) != 0) {
                if (l46Var.i(l26Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i7 |= i9;
            }
            if ((599187 & i7) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i7 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        j2 = ((y72) l46Var.k(em2.a)).a;
                        m82Var = (m82) l46Var.k(o82.a);
                        cu6Var4 = m82Var.f0;
                        if (cu6Var4 == null) {
                            long j6 = y72.j;
                            cu6VarA = new cu6(j6, j2, j6, y72.b(j2, f2));
                            m82Var.f0 = cu6VarA;
                        } else {
                            cu6VarA = cu6Var4;
                        }
                        if (!faf.a(cu6VarA.b, j2)) {
                            cu6VarA = cu6VarA.a(cu6VarA.a, j2, cu6VarA.c, y72.b(j2, f2));
                        }
                        i7 &= -7169;
                        cu6Var2 = cu6VarA;
                    }
                    i8 = i7 & (-458753);
                    j09 j09Var9 = j09Var4;
                    x4dVarB = u5d.b(ym8.e, l46Var);
                    j09Var5 = j09Var9;
                } else {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        j2 = ((y72) l46Var.k(em2.a)).a;
                        m82Var = (m82) l46Var.k(o82.a);
                        cu6Var4 = m82Var.f0;
                        if (cu6Var4 == null) {
                            long j7 = y72.j;
                            cu6VarA = new cu6(j7, j2, j7, y72.b(j2, f2));
                            m82Var.f0 = cu6VarA;
                        } else {
                            cu6VarA = cu6Var4;
                        }
                        if (!faf.a(cu6VarA.b, j2)) {
                            cu6VarA = cu6VarA.a(cu6VarA.a, j2, cu6VarA.c, y72.b(j2, f2));
                        }
                        i7 &= -7169;
                        cu6Var2 = cu6VarA;
                    }
                    i8 = i7 & (-458753);
                    j09 j09Var10 = j09Var4;
                    x4dVarB = u5d.b(ym8.e, l46Var);
                    j09Var5 = j09Var10;
                }
                boolean z8 = z3;
                cu6Var3 = cu6Var2;
                l46Var.s();
                int i14 = i8 << 3;
                i(j09Var5, x16Var, z8, x4dVarB, cu6Var3, l26Var, l46Var, ((i8 >> 3) & 14) | (i14 & 112) | (i8 & 896) | (57344 & i14) | (i14 & 458752) | (i8 & 3670016));
                x4dVar2 = x4dVarB;
                z5 = z8;
                j09Var3 = j09Var5;
            } else {
                l46Var.Z();
                x4dVar2 = x4dVar;
                j09Var3 = j09Var2;
                z5 = z3;
                cu6Var3 = cu6Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t42(x16Var, j09Var3, z5, cu6Var3, x4dVar2, l26Var, i2, i3);
            }
        }
        i4 |= 384;
        z3 = z2;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                cu6Var2 = cu6Var;
                if (l46Var.g(cu6Var2)) {
                    i10 = 2048;
                }
                i4 |= i10;
            } else {
                cu6Var2 = cu6Var;
            }
            i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i4 |= i10;
        } else {
            cu6Var2 = cu6Var;
        }
        i7 = i4 | 24576;
        if ((196608 & i2) == 0) {
            i7 = 90112 | i4;
        }
        if ((1572864 & i2) != 0) {
            if (l46Var.i(l26Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i7 |= i9;
        }
        if ((599187 & i7) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i7 & 1, z4)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    j2 = ((y72) l46Var.k(em2.a)).a;
                    m82Var = (m82) l46Var.k(o82.a);
                    cu6Var4 = m82Var.f0;
                    if (cu6Var4 == null) {
                        long j8 = y72.j;
                        cu6VarA = new cu6(j8, j2, j8, y72.b(j2, f2));
                        m82Var.f0 = cu6VarA;
                    } else {
                        cu6VarA = cu6Var4;
                    }
                    if (!faf.a(cu6VarA.b, j2)) {
                        cu6VarA = cu6VarA.a(cu6VarA.a, j2, cu6VarA.c, y72.b(j2, f2));
                    }
                    i7 &= -7169;
                    cu6Var2 = cu6VarA;
                }
                i8 = i7 & (-458753);
                j09 j09Var11 = j09Var4;
                x4dVarB = u5d.b(ym8.e, l46Var);
                j09Var5 = j09Var11;
            } else {
                if (i11 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    j2 = ((y72) l46Var.k(em2.a)).a;
                    m82Var = (m82) l46Var.k(o82.a);
                    cu6Var4 = m82Var.f0;
                    if (cu6Var4 == null) {
                        long j9 = y72.j;
                        cu6VarA = new cu6(j9, j2, j9, y72.b(j2, f2));
                        m82Var.f0 = cu6VarA;
                    } else {
                        cu6VarA = cu6Var4;
                    }
                    if (!faf.a(cu6VarA.b, j2)) {
                        cu6VarA = cu6VarA.a(cu6VarA.a, j2, cu6VarA.c, y72.b(j2, f2));
                    }
                    i7 &= -7169;
                    cu6Var2 = cu6VarA;
                }
                i8 = i7 & (-458753);
                j09 j09Var12 = j09Var4;
                x4dVarB = u5d.b(ym8.e, l46Var);
                j09Var5 = j09Var12;
            }
            boolean z9 = z3;
            cu6Var3 = cu6Var2;
            l46Var.s();
            int i15 = i8 << 3;
            i(j09Var5, x16Var, z9, x4dVarB, cu6Var3, l26Var, l46Var, ((i8 >> 3) & 14) | (i15 & 112) | (i8 & 896) | (57344 & i15) | (i15 & 458752) | (i8 & 3670016));
            x4dVar2 = x4dVarB;
            z5 = z9;
            j09Var3 = j09Var5;
        } else {
            l46Var.Z();
            x4dVar2 = x4dVar;
            j09Var3 = j09Var2;
            z5 = z3;
            cu6Var3 = cu6Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t42(x16Var, j09Var3, z5, cu6Var3, x4dVar2, l26Var, i2, i3);
        }
    }

    public static final void i(j09 j09Var, x16 x16Var, boolean z2, x4d x4dVar, cu6 cu6Var, l26 l26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.g(x4dVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.g(cu6Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.g(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var.i(l26Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (l46Var.W(i4 & 1, (599187 & i4) != 599186)) {
            l46Var.f0(977045485);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR;
            l46Var.r(false);
            oq6 oq6Var = p77.a;
            j09 j09VarD = j09Var.D(xv8.a);
            float f2 = ym8.f;
            long jF = cgg.f(ym8.g + f2 + f2, 40.0f);
            FillElement fillElement = b.a;
            j09 j09VarP = xo1.p(androidx.compose.foundation.b.b(tm7.o(oa7.E(b.m(j09VarD, bj4.b(jF), bj4.a(jF)), x4dVar), z2 ? cu6Var.a : cu6Var.c, x4dVar), t69Var, d5c.a(0.0f, 7, 0L, false), z2, new i5c(0), x16Var, 8));
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarP);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            mh3.a(ib8.f(z2 ? cu6Var.b : cu6Var.d, em2.a), l26Var, l46Var, ((i4 >> 15) & 112) | 8);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(j09Var, x16Var, z2, x4dVar, cu6Var, l26Var, i2);
        }
    }

    public static final void j(boolean z2, a26 a26Var, j09 j09Var, boolean z3, ku6 ku6Var, x4d x4dVar, dd2 dd2Var, l46 l46Var, int i2) {
        boolean z4;
        ku6 ku6Var2;
        int i3;
        int i4;
        ku6 ku6Var3;
        boolean z5;
        l46 l46Var2 = l46Var;
        float f2 = feg.j;
        l46Var2.h0(-1031402037);
        int i5 = i2 | (l46Var2.h(z2) ? 4 : 2) | (l46Var2.i(a26Var) ? 32 : 16) | (l46Var2.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 207872;
        if (l46Var2.W(i5 & 1, (4793491 & i5) != 4793490)) {
            l46Var2.b0();
            if ((i2 & 1) == 0 || l46Var2.C()) {
                l46Var2.f0(-1355771567);
                long j2 = ((y72) l46Var2.k(em2.a)).a;
                m82 m82Var = (m82) l46Var2.k(o82.a);
                ku6 ku6Var4 = m82Var.g0;
                if (ku6Var4 == null) {
                    long j3 = y72.j;
                    ku6Var4 = new ku6(j3, j2, j3, y72.b(j2, f2), j3, o82.c(m82Var, feg.k));
                    m82Var.g0 = ku6Var4;
                }
                long j4 = ku6Var4.b;
                if (faf.a(j4, j2)) {
                    l46Var2.r(false);
                    i3 = -57345;
                } else {
                    long jB = y72.b(j2, f2);
                    i3 = -57345;
                    ku6 ku6Var5 = new ku6(ku6Var4.a, j2 != 16 ? j2 : j4, ku6Var4.c, jB != 16 ? jB : ku6Var4.d, ku6Var4.e, ku6Var4.f);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                    ku6Var4 = ku6Var5;
                }
                i4 = i5 & i3;
                ku6Var3 = ku6Var4;
                z5 = true;
            } else {
                l46Var2.Z();
                i4 = i5 & (-57345);
                z5 = z3;
                ku6Var3 = ku6Var;
            }
            l46Var2.s();
            boolean z6 = z5;
            k(z2, a26Var, j09Var, z6, ku6Var3, x4dVar, dd2Var, l46Var2, i4 & 33554430);
            z4 = z6;
            ku6Var2 = ku6Var3;
        } else {
            l46Var.Z();
            z4 = z3;
            ku6Var2 = ku6Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new we3(z2, a26Var, j09Var, z4, ku6Var2, x4dVar, dd2Var, i2);
        }
    }

    public static final void k(boolean z2, a26 a26Var, j09 j09Var, boolean z3, ku6 ku6Var, x4d x4dVar, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        a26 a26Var2;
        long j2;
        long j3;
        l46Var.h0(1724745099);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.h(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            a26Var2 = a26Var;
            i3 |= l46Var.i(a26Var2) ? 32 : 16;
        } else {
            a26Var2 = a26Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.g(ku6Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.g(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var.g(x4dVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= l46Var.i(dd2Var) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (l46Var.W(i4 & 1, (4793491 & i4) != 4793490)) {
            l46Var.b0();
            if ((i2 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            l46Var.f0(1187972528);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR;
            l46Var.r(false);
            oq6 oq6Var = p77.a;
            j09 j09VarD = j09Var.D(xv8.a);
            float f2 = ym8.f;
            long jF = cgg.f(ym8.g + f2 + f2, 40.0f);
            FillElement fillElement = b.a;
            j09 j09VarE = oa7.E(b.m(j09VarD, bj4.b(jF), bj4.a(jF)), x4dVar);
            if (z3) {
                j2 = !z2 ? ku6Var.a : ku6Var.e;
            } else {
                j2 = ku6Var.c;
            }
            j09 j09VarQ = b21.Q(tm7.o(j09VarE, ((y72) q1c.i(new y72(j2), l46Var).getValue()).a, g21.f), z2, t69Var, d5c.a(0.0f, 7, 0L, false), z3, new i5c(1), a26Var2);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarQ);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            if (z3) {
                j3 = !z2 ? ku6Var.b : ku6Var.f;
            } else {
                j3 = ku6Var.d;
            }
            y72 y72Var = (y72) q1c.i(new y72(j3), l46Var).getValue();
            long j4 = y72Var.a;
            mh3.a(em2.a.a(y72Var), dd2Var, l46Var, ((i4 >> 18) & 112) | 8);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iy0(z2, a26Var, j09Var, z3, ku6Var, x4dVar, dd2Var, i2);
        }
    }

    public static final void l(int i2, l46 l46Var) {
        l46Var.h0(1743333217);
        int i3 = 13;
        if (l46Var.W(i2 & 1, i2 != 0)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final wb7 wb7Var = (wb7) z5c.G(job.a.b(wb7.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            x48 x48Var = (x48) l46Var.k(cb8.a);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            final aw2 aw2Var = (aw2) objR;
            boolean zG = l46Var.g(wb7Var) | l46Var.g(aw2Var);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: lb7
                    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
                    public final void onPrimaryClipChanged() {
                        ClipData primaryClip = tce.a().getPrimaryClip();
                        if (primaryClip != null) {
                            ynb.V(aw2Var, null, null, new ob7(primaryClip, wb7Var, null), 3);
                        }
                    }
                };
                l46Var.p0(objR2);
            }
            ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = (ClipboardManager.OnPrimaryClipChangedListener) objR2;
            boolean zI = l46Var.i(onPrimaryClipChangedListener);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new za6(i3, onPrimaryClipChangedListener);
                l46Var.p0(objR3);
            }
            af1.g(onPrimaryClipChangedListener, (a26) objR3, l46Var);
            boolean zI2 = l46Var.i(x48Var) | l46Var.i(onPrimaryClipChangedListener);
            Object objR4 = l46Var.R();
            if (zI2 || objR4 == obj) {
                objR4 = new nb7(x48Var, onPrimaryClipChangedListener, null);
                l46Var.p0(objR4);
            }
            af1.p(x48Var, onPrimaryClipChangedListener, (l26) objR4, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i2, i3);
        }
    }

    public static final void m(int i2, int i3, l46 l46Var, j09 j09Var, String str) {
        int i4;
        String str2;
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        str.getClass();
        l46Var2.h0(895315679);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var.g(j09Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var2.g(str) ? 32 : 16;
        }
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09Var3 = i5 != 0 ? g09Var : j09Var;
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var3);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.annual_monthly_report_summary_title, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            o5c.f(l46Var2, b.d(g09Var, 28.0f));
            str2 = str;
            d8c.b(b.r(b.c(g09Var, 1.0f)), null, new bx9(20.0f, 20.0f, 20.0f, 20.0f), af1.b0(1296683032, new ob0(str2, 17), l46Var2), l46Var2, 3462, 2);
            l46Var2.r(true);
            j09Var2 = j09Var3;
        } else {
            str2 = str;
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mc2(j09Var2, str2, i2, i3, 3);
        }
    }

    public static final void n(v50 v50Var, String str, x16 x16Var, x16 x16Var2, a26 a26Var, l46 l46Var, int i2) {
        int i3;
        str.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        a26Var.getClass();
        l46Var.h0(-662189969);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.e(v50Var == null ? -1 : v50Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            rs0.f(b.c, false, af1.b0(284659218, new qi3(x16Var, v50Var, e89Var, x16Var2, a26Var, str), l46Var), l46Var, 390, 2);
            boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new x08(e89Var, 10);
                l46Var.p0(objR2);
            }
            od4.a(3504, af1.b0(390125826, new ob0(str, 15), l46Var), (x16) objR2, l46Var, "annual-monthly-summary-share", zBooleanValue);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb(v50Var, str, x16Var, x16Var2, a26Var, i2);
        }
    }

    public static final void o(l5a l5aVar, int i2, j09 j09Var, Integer num, l46 l46Var, int i3) {
        j09 j09Var2;
        List listI;
        l46Var.h0(-2126684000);
        int i4 = i3 | (l46Var.e(l5aVar.ordinal()) ? 4 : 2) | (l46Var.e(i2) ? 32 : 16) | 384 | (l46Var.g(num) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i5 = 0;
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2);
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i5)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l46Var.f0(459293880);
            List listI2 = t72.I(a4a.c, a4a.d);
            List listI3 = t72.I(a4a.g, a4a.v);
            List listI4 = t72.I(a4a.w, a4a.x, a4a.y, a4a.z, a4a.X);
            int iOrdinal = l5aVar.ordinal();
            a4a a4aVar = a4a.a;
            if (iOrdinal == 0) {
                listI = t72.I(new b4a(R.string.paywall_subscription_benefits, s72.Q0(s72.R0(s72.Q0(t72.H(a4aVar), listI2), a4a.e), listI4), true), new b4a(R.string.paywall_annual_exclusive_benefits, listI3, false));
            } else if (iOrdinal == 1) {
                listI = t72.H(new b4a(R.string.paywall_subscription_benefits, s72.Q0(s72.R0(s72.Q0(s72.Q0(t72.H(a4aVar), listI2), listI3), a4a.f), listI4), true));
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return;
                }
                listI = t72.I(new b4a(R.string.paywall_times_card_benefits, s72.Q0(t72.H(a4a.b), listI4), true), new b4a(R.string.paywall_subscription_exclusive_benefits, s72.Q0(listI2, listI3), false));
            }
            Iterator it = listI.iterator();
            while (it.hasNext()) {
                a((b4a) it.next(), num, i2, l46Var, ((i4 >> 6) & 112) | ((i4 << 3) & 896));
            }
            l46Var.r(false);
            l46Var.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(l5aVar, i2, j09Var2, num, i3);
        }
    }

    public static final void p(tr2 tr2Var, l46 l46Var, int i2) {
        l46Var.h0(1930726879);
        int i3 = 2;
        int i4 = (l46Var.i(tr2Var) ? 4 : 2) | i2;
        if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
            iy9 iy9Var = (iy9) tr2Var.c.J1.getValue();
            boolean z2 = (i4 & 14) == 4 || l46Var.i(tr2Var);
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new fkb(tr2Var, null);
                l46Var.p0(objR);
            }
            x97 x97Var = InterruptedDrawing.Companion;
            af1.o((l26) objR, l46Var, iy9Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ur2(tr2Var, i2, i3);
        }
    }

    public static final void q(p69 p69Var, int i2) {
        if (p69Var.b == 0 || !(p69Var.a(0) == i2 || p69Var.a(p69Var.b - 1) == i2)) {
            int i3 = p69Var.b;
            p69Var.c(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int iA = p69Var.a(i4);
                if (i2 <= iA) {
                    break;
                }
                p69Var.f(i3, iA);
                i3 = i4;
            }
            p69Var.f(i3, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int r(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm8.r(int, int, int, boolean):int");
    }

    public static final void s(ewf ewfVar, vea veaVar, h48 h48Var) {
        veaVar.getClass();
        h48Var.getClass();
        zcc zccVar = (zcc) ewfVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (zccVar == null || zccVar.c) {
            return;
        }
        zccVar.b(veaVar, h48Var);
        g48 g48Var = ((a58) h48Var).i;
        if (g48Var == g48.b || g48Var.compareTo(g48.d) >= 0) {
            veaVar.B();
        } else {
            h48Var.a(new rr3(1, h48Var, veaVar));
        }
    }

    public static final i8f t(i8f i8fVar, c8f c8fVar) {
        if (c8fVar == null || i8fVar.a() == dsf.INVARIANT) {
            return i8fVar;
        }
        if (c8fVar.x() != i8fVar.a()) {
            cp1 cp1Var = new cp1(i8fVar);
            e7f.b.getClass();
            return new dzd(new yo1(i8fVar, cp1Var, false, e7f.c));
        }
        if (!i8fVar.c()) {
            return new dzd(i8fVar.b());
        }
        yd8 yd8Var = ge8.e;
        yd8Var.getClass();
        return new dzd(new c28(yd8Var, new j5(5, i8fVar)));
    }

    public static b76 u(String str, String str2) {
        Exception excA;
        try {
            k76 k76Var = new k76(new k(26), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excA = k99.A(new k(0), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excA = k99.A(new k(1), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excA = k99.A(new k(2), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excA = k99.A(new k(3), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excA = k99.A(new k(4), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excA = k99.A(new k(5), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excA = k99.A(new k(6), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excA = k99.A(new k(7), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excA = k99.A(new k(8), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excA = k99.A(new k(9), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excA = k99.A(new k(10), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excA = k99.A(new k(11), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excA = k99.A(new k(12), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excA = k99.A(new k(13), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excA = k99.A(new k(14), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excA = k99.A(new k(15), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excA = k99.A(new k(16), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excA = k99.A(new k(17), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excA = k99.A(new k(18), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excA = k99.A(new k(19), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excA = k99.A(new k(20), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excA = k99.A(new k(21), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excA = k99.A(new k(22), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excA = k99.A(new k(23), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excA = k99.A(new k(24), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excA = k99.A(new k(25), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excA = k99.A(new k(26), str2, k76Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excA = k99.A(new k(27), str2, k76Var);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new dz5();
                }
                excA = k99.A(new k(28), str2, k76Var);
            }
            return (b76) excA;
        } catch (dz5 unused) {
            return new a76(str2, str);
        }
    }

    public static boolean v(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt == cCharAt2 || ((c2 = (char) ((cCharAt | ' ') - 97)) < 26 && c2 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static bb3 w(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            qc0.p("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return bb3.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i2 = 0;
            boolean z2 = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z2) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i3 = objectInputStream.readInt();
                    while (i2 < i3) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i2++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s2 = dataInputStream.readShort();
                    if (s2 == -21521) {
                        short s3 = dataInputStream.readShort();
                        if (s3 != 1) {
                            ho7.j(tec.e(s3, "Unsupported version number: "));
                        }
                    } else {
                        ho7.j(tec.e(s2, "Magic number doesn't match: "));
                    }
                    int i4 = dataInputStream.readInt();
                    while (i2 < i4) {
                        linkedHashMap.put(dataInputStream.readUTF(), x(dataInputStream, dataInputStream.readByte()));
                        i2++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ym8.t(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e2) {
            ff8.h().g(rd3.a, "Error in Data#fromByteArray: ", e2);
        } catch (ClassNotFoundException e3) {
            ff8.h().g(rd3.a, "Error in Data#fromByteArray: ", e3);
        }
        return new bb3(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable x(DataInputStream dataInputStream, byte b2) throws IOException {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int i3 = dataInputStream.readInt();
            ?? r0 = new Boolean[i3];
            while (i2 < i3) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int i4 = dataInputStream.readInt();
            ?? r1 = new Byte[i4];
            while (i2 < i4) {
                r1[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r1;
        }
        if (b2 == 10) {
            int i5 = dataInputStream.readInt();
            ?? r2 = new Integer[i5];
            while (i2 < i5) {
                r2[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r2;
        }
        if (b2 == 11) {
            int i6 = dataInputStream.readInt();
            ?? r3 = new Long[i6];
            while (i2 < i6) {
                r3[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r3;
        }
        if (b2 == 12) {
            int i7 = dataInputStream.readInt();
            ?? r4 = new Float[i7];
            while (i2 < i7) {
                r4[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r4;
        }
        if (b2 == 13) {
            int i8 = dataInputStream.readInt();
            ?? r5 = new Double[i8];
            while (i2 < i8) {
                r5[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r5;
        }
        if (b2 != 14) {
            qc0.p(tec.e(b2, "Unsupported type "));
            return null;
        }
        int i9 = dataInputStream.readInt();
        ?? r6 = new String[i9];
        while (i2 < i9) {
            String utf = dataInputStream.readUTF();
            if (pa7.t(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i2] = utf;
            i2++;
        }
        return r6;
    }

    public static Object y(Future future) {
        ok8.o("Future was expected to be done, " + future, future.isDone());
        return A(future);
    }

    public static final gx6 z() {
        gx6 gx6Var = R;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new p1a(8.59f, 16.59f));
        arrayList.add(new o1a(13.17f, 12.0f));
        arrayList.add(new o1a(8.59f, 7.41f));
        arrayList.add(new o1a(10.0f, 6.0f));
        arrayList.add(new w1a(6.0f, 6.0f));
        arrayList.add(new w1a(-6.0f, 6.0f));
        arrayList.add(new w1a(-1.41f, -1.41f));
        arrayList.add(l1a.c);
        fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        R = gx6VarB;
        return gx6VarB;
    }
}
