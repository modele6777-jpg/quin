package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.internal.debugmeta.c;
import io.sentry.k2;
import io.sentry.q5;
import io.sentry.util.d;
import io.sentry.vendor.a;
import io.sentry.z0;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sug implements g1b, cjb, qsd {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public sug(int i, byte b) {
        this.a = i;
        switch (i) {
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.b = 255;
                this.c = null;
                break;
            case 15:
                this.c = new LinkedHashMap();
                break;
            case 17:
                this.c = new d0a(8);
                break;
            default:
                this.b = 0;
                this.c = new StringBuilder();
                break;
        }
    }

    public static sug h(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        int i2;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        int i3 = 3;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new sug(obj, t82.b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), i3);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = cbb.e;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayObtainAttributes.getColor(1, 0) : 0;
        int i5 = 1;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i5) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = cbb.f;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i2 = 0;
                } else {
                    i2 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i5 = 1;
        }
        w84 w84Var = arrayList2.size() > 0 ? new w84(arrayList2, arrayList) : null;
        if (w84Var == null) {
            w84Var = z ? new w84(color, color2, color3) : new w84(color, color3);
        }
        if (i4 != 1) {
            if (i4 != 2) {
                int[] iArr3 = (int[]) w84Var.b;
                float[] fArr = (float[]) w84Var.c;
                if (i6 != 1) {
                    tileMode2 = i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f, f2, f5, f6, iArr3, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) w84Var.b, (float[]) w84Var.c);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr4 = (int[]) w84Var.b;
            float[] fArr2 = (float[]) w84Var.c;
            if (i6 != 1) {
                tileMode = i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr4, fArr2, tileMode);
        }
        return new sug(radialGradient, 0, 3);
    }

    public static void i(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = pa7.L(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        b1.l("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            b1.n("SupportSQLite", "delete failed: ", e);
        }
    }

    public Object a() {
        Object[] objArr = (Object[]) this.c;
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    @Override // defpackage.cjb
    public void b() {
        this.b = 0;
        ((wr4) this.c).a.F0.b();
    }

    @Override // defpackage.cjb
    public void c() {
        djb djbVar = ((wr4) this.c).a;
        int i = this.b;
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        this.b = i2;
        if (i2 == 0 && i > 0) {
            djbVar.F0.c();
        }
        yib yibVarB = b21.B(djbVar);
        sug sugVar = yibVarB != null ? ((wr4) yibVarB).b : null;
        if (sugVar != null) {
            sugVar.c();
        }
    }

    @Override // defpackage.cjb
    public sug d(sug sugVar) {
        djb djbVar = ((wr4) this.c).a;
        sug sugVarD = djbVar.F0.d(sugVar);
        if (sugVarD == null) {
            return null;
        }
        yib yibVarB = b21.B(djbVar);
        sug sugVar2 = yibVarB != null ? ((wr4) yibVarB).b : null;
        return sugVar2 == null ? sugVarD : sugVar2.d(sugVarD);
    }

    @Override // defpackage.cjb
    public void e() {
        djb djbVar = ((wr4) this.c).a;
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            djbVar.F0.e();
        }
        yib yibVarB = b21.B(djbVar);
        sug sugVar = yibVarB != null ? ((wr4) yibVarB).b : null;
        if (sugVar != null) {
            sugVar.e();
        }
    }

    @Override // defpackage.cjb
    public void f() {
        ((wr4) this.c).a.F0.f();
        this.b = 0;
    }

    public void g() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = ((LinkedHashMap) this.c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    wib wibVar = (wib) s72.x0(arrayList);
                    if ((wibVar != null ? (bv6) wibVar.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((wib) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // defpackage.h1b
    public Object get() {
        String string;
        r23 r23Var = (r23) this.c;
        int i = this.b;
        ic1 ic1Var = null;
        switch (i) {
            case 0:
                return new nh1((dg7) ((g1b) r23Var.d).get());
            case 1:
                return tq.d();
            case 2:
                return new mf1((yd1) ((g1b) r23Var.v).get());
            case 3:
                dh1 dh1Var = (dh1) ((m6c) r23Var.a).b;
                sug sugVar = (sug) r23Var.A;
                Context contextA = r23Var.a();
                qwe qweVar = (qwe) ((g1b) r23Var.f).get();
                nh1 nh1Var = (nh1) ((g1b) r23Var.e).get();
                sugVar.getClass();
                qweVar.getClass();
                nh1Var.getClass();
                Map map = (Map) dh1Var.d.b;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    vd1 vd1Var = (vd1) sugVar.get();
                    Trace.endSection();
                    String str = "CXCP-Camera2";
                    if (map.containsKey(new wd1(str))) {
                        r82.e(wd1.a("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.", "CameraBackendConfig#cameraBackends should not contain a backend with ");
                        return null;
                    }
                    Map mapM = bm8.M(map, new iy9(new wd1(str), new oh1(vd1Var)));
                    if (mapM.containsKey(new wd1(str))) {
                        return new yd1("CXCP-Camera2", mapM, contextA, qweVar, nh1Var);
                    }
                    StringBuilder sb = new StringBuilder("Failed to find ");
                    sb.append((Object) wd1.a("CXCP-Camera2"));
                    qc0.m(sb, " in the list of available CameraPipe backends! Available values are ", mapM.keySet());
                    return null;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                return new nb1((qwe) ((g1b) r23Var.f).get(), (gd1) ((g1b) r23Var.k).get(), (qd1) ((g1b) r23Var.n).get(), (z1b) ((g1b) r23Var.u).get(), new ssg(11, r23Var), r23Var.a());
            case 5:
                sug sugVar2 = (sug) r23Var.b;
                nh1 nh1Var2 = (nh1) ((g1b) r23Var.e).get();
                dg7 dg7Var = (dg7) ((g1b) r23Var.d).get();
                nh1Var2.getClass();
                dg7Var.getClass();
                ArrayList arrayList = new ArrayList();
                ThreadFactory threadFactory = iw.b;
                int i2 = -1;
                ScheduledExecutorService scheduledExecutorServiceA = iw.a(new fw(i2, iw.b(threadFactory, "CXCP-IO-")), 8);
                arrayList.add(scheduledExecutorServiceA);
                sv2 sv2VarZ = t72.z(scheduledExecutorServiceA);
                ScheduledExecutorService scheduledExecutorServiceA2 = iw.a(new fw(i2, iw.b(threadFactory, "CXCP-BG-")), 4);
                arrayList.add(scheduledExecutorServiceA2);
                sv2 sv2VarZ2 = t72.z(scheduledExecutorServiceA2);
                ScheduledExecutorService scheduledExecutorServiceA3 = iw.a(new fw(-3, iw.b(threadFactory, "CXCP-")), sugVar2.b);
                arrayList.add(scheduledExecutorServiceA3);
                sv2 sv2VarZ3 = t72.z(scheduledExecutorServiceA3);
                nh1Var2.a(kh1.c, new m45(28, arrayList));
                h2e h2eVar = new h2e(sugVar2, nh1Var2);
                ykc ykcVar = new ykc(25, sugVar2, nh1Var2);
                mmb mmbVar = new mmb();
                mmb mmbVar2 = new mmb();
                mmbVar.element = jgb.k(i7h.I(new t8e(dg7Var), sv2VarZ3).p0(new wv2("CXCP")));
                mmbVar2.element = jgb.k(i7h.I(new t8e(dg7Var), new wv2("CXCP-Dispatch")));
                nh1Var2.a(kh1.b, new xu8(19, mmbVar, mmbVar2));
                return new qwe((aw2) mmbVar.element, (aw2) mmbVar2.element, scheduledExecutorServiceA, sv2VarZ, scheduledExecutorServiceA2, sv2VarZ2, scheduledExecutorServiceA3, sv2VarZ3, h2eVar, ykcVar);
            case 6:
                return new gd1((g1b) r23Var.g, (qwe) ((g1b) r23Var.f).get(), r23Var.a(), (PackageManager) ((g1b) r23Var.h).get(), (nd1) ((g1b) r23Var.i).get(), (g1b) r23Var.j, (nh1) ((g1b) r23Var.e).get(), (dg7) ((g1b) r23Var.d).get());
            case 7:
                Object systemService = r23Var.a().getSystemService("camera");
                systemService.getClass();
                return (CameraManager) systemService;
            case 8:
                PackageManager packageManager = r23Var.a().getPackageManager();
                packageManager.getClass();
                return packageManager;
            case 9:
                return new nd1();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Context contextA2 = r23Var.a();
                kf1 kf1Var = new kf1();
                if (Build.VERSION.SDK_INT >= 35) {
                    kf1Var.b = new ic1(contextA2);
                }
                try {
                    ServiceInfo[] serviceInfoArr = contextA2.getPackageManager().getPackageInfo(contextA2.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    qc0.p("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                ic1Var = (ic1) Class.forName(str2).getConstructor(Context.class).newInstance(contextA2);
                            } catch (Exception e) {
                                ho7.r("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                kf1Var.a = ic1Var;
                return kf1Var;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new qd1(r23Var.a(), (qwe) ((g1b) r23Var.f).get(), (s8a) ((g1b) r23Var.l).get(), ((dh1) ((m6c) r23Var.a).b).c, (uce) ((g1b) r23Var.m).get());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new s8a(r23Var.a());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new uce();
            case 14:
                return new z1b((s8a) ((g1b) r23Var.l).get(), (xzb) ((g1b) r23Var.s).get(), (hd1) ((g1b) r23Var.t).get(), (nd1) ((g1b) r23Var.i).get(), (qwe) ((g1b) r23Var.f).get());
            case 15:
                g1b g1bVar = (g1b) r23Var.g;
                m6c m6cVar = (m6c) r23Var.a;
                return new xzb(new pj1(new a90(g1bVar, (qwe) ((g1b) r23Var.f).get()), (rd1) ((g1b) r23Var.n).get(), (nd1) ((g1b) r23Var.i).get(), (sd1) ((g1b) r23Var.p).get(), (uce) ((g1b) r23Var.m).get(), ((dh1) m6cVar.b).e, (qwe) ((g1b) r23Var.f).get()), (nd1) ((g1b) r23Var.i).get(), new vb1((g1b) r23Var.g, (qwe) ((g1b) r23Var.f).get(), (dg7) ((g1b) r23Var.d).get()), (uce) ((g1b) r23Var.m).get(), (gr) ((g1b) r23Var.q).get(), (lk0) ((g1b) r23Var.r).get(), ((dh1) m6cVar.b).e, (qwe) ((g1b) r23Var.f).get());
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new sd1((rd1) ((g1b) r23Var.n).get(), (i4e) ((g1b) r23Var.o).get());
            case 17:
                Object obj = r23Var.a;
                return new i4e();
            case 18:
                Object systemService2 = r23Var.a().getSystemService("device_policy");
                systemService2.getClass();
                return new gr((DevicePolicyManager) systemService2);
            case 19:
                return new lk0((qwe) ((g1b) r23Var.f).get(), (nh1) ((g1b) r23Var.e).get(), (dg7) ((g1b) r23Var.d).get());
            case 20:
                return new kd1((qwe) ((g1b) r23Var.f).get(), (sd1) ((g1b) r23Var.p).get(), (xzb) ((g1b) r23Var.s).get());
            case 21:
                r23Var.getClass();
                qwe qweVar2 = (qwe) ((g1b) r23Var.f).get();
                yd1 yd1Var = (yd1) ((g1b) r23Var.v).get();
                qweVar2.getClass();
                yd1Var.getClass();
                return new ph1();
            case 22:
                return new bk1();
            case 23:
                return new mh2();
            default:
                throw new AssertionError(i);
        }
    }

    public void j(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public boolean k() {
        return ((kq4) this.c) != null;
    }

    public void l(int i, gh0 gh0Var) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            gh0 gh0Var2 = ((gh0[]) this.c)[i2];
            gh0Var2.getClass();
            if (pa7.M(0L, gh0Var.g - gh0Var2.g) <= 0) {
                break;
            }
            gh0Var2.f = i;
            ((gh0[]) this.c)[i] = gh0Var2;
            i = i2;
        }
        ((gh0[]) this.c)[i] = gh0Var;
        gh0Var.f = i;
    }

    public HashMap m(Map map, z0 z0Var) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), s(z0Var, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public void n(gz5 gz5Var, int i, int i2) {
        ((ld5) this.c).r(new e9e(gz5Var), i, i2);
    }

    public long o(rq3 rq3Var) {
        d0a d0aVar = (d0a) this.c;
        int i = 0;
        rq3Var.d(d0aVar.a, 0, 1, false);
        int i2 = d0aVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        rq3Var.d(d0aVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (d0aVar.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public void p() {
        zw1 zw1Var = zw1.c;
        char[] cArr = (char[]) this.c;
        zw1Var.getClass();
        cArr.getClass();
        synchronized (zw1Var) {
            int i = zw1Var.b;
            if (cArr.length + i < nd0.a) {
                zw1Var.b = i + cArr.length;
                zw1Var.a.addLast(cArr);
            }
        }
    }

    public void q(Object obj) {
        Object[] objArr = (Object[]) this.c;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                qc0.p("Already in the pool!");
                return;
            }
        }
        int i3 = this.b;
        if (i3 < objArr.length) {
            objArr[i3] = obj;
            this.b = i3 + 1;
        }
    }

    public void r(gh0 gh0Var) {
        gh0 gh0Var2;
        int i = gh0Var.f;
        if (i == -1) {
            qc0.j("Failed requirement.");
            return;
        }
        int i2 = this.b;
        gh0 gh0Var3 = ((gh0[]) this.c)[i2];
        gh0Var3.getClass();
        gh0Var.f = -1;
        ((gh0[]) this.c)[i2] = null;
        this.b = i2 - 1;
        if (gh0Var == gh0Var3) {
            return;
        }
        int iM = pa7.M(0L, gh0Var3.g - gh0Var.g);
        if (iM == 0) {
            ((gh0[]) this.c)[i] = gh0Var3;
            gh0Var3.f = i;
            return;
        }
        if (iM >= 0) {
            l(i, gh0Var3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.b;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                gh0Var2 = ((gh0[]) this.c)[i3];
                gh0Var2.getClass();
            } else {
                gh0Var2 = ((gh0[]) this.c)[i3];
                gh0Var2.getClass();
                gh0 gh0Var4 = ((gh0[]) this.c)[i4];
                gh0Var4.getClass();
                if (pa7.M(0L, gh0Var4.g - gh0Var2.g) >= 0) {
                    gh0Var2 = gh0Var4;
                }
            }
            if (pa7.M(0L, gh0Var2.g - gh0Var3.g) <= 0) {
                break;
            }
            int i6 = gh0Var2.f;
            gh0Var2.f = i;
            ((gh0[]) this.c)[i] = gh0Var2;
            i = i6;
        }
        ((gh0[]) this.c)[i] = gh0Var3;
        gh0Var3.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public Object s(z0 z0Var, Object obj) {
        Object objW;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = d.a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return d.b((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        HashSet hashSet = (HashSet) this.c;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.c = hashSet;
        }
        if (hashSet.contains(obj)) {
            z0Var.i(q5.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.b) {
                hashSet.remove(obj);
                z0Var.i(q5.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    Object[] objArr = (Object[]) obj;
                    objW = new ArrayList();
                    int length2 = objArr.length;
                    while (i < length2) {
                        objW.add(s(z0Var, objArr[i]));
                        i++;
                    }
                } else if (obj instanceof Collection) {
                    objW = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        objW.add(s(z0Var, it.next()));
                    }
                } else if (obj instanceof Map) {
                    objW = m((Map) obj, z0Var);
                } else {
                    objW = w(z0Var, obj);
                    if (objW.isEmpty()) {
                        objW = obj.toString();
                    }
                }
                return objW;
            } catch (Exception e) {
                z0Var.d(q5.INFO, "Not serializing object due to throwing sub-path.", e);
                return null;
            }
        } finally {
            hashSet.remove(obj);
        }
    }

    public void t(c cVar, z0 z0Var, Object obj) throws IOException {
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.b;
        if (obj == null) {
            cVar2.u();
            return;
        }
        if (obj instanceof Character) {
            cVar.z(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            cVar.z((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            cVar.A(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            cVar.y((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                cVar.z(a.f(((Date) obj).getTime()));
                return;
            } catch (Exception e) {
                z0Var.d(q5.ERROR, "Error when serializing Date", e);
                cVar2.u();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                cVar.z(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                z0Var.d(q5.ERROR, "Error when serializing TimeZone", e2);
                cVar2.u();
                return;
            }
        }
        if (obj instanceof k2) {
            ((k2) obj).serialize(cVar, z0Var);
            return;
        }
        if (obj instanceof Collection) {
            u(cVar, z0Var, (Collection) obj);
            return;
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            u(cVar, z0Var, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList2.add(Byte.valueOf(bArr[i]));
                i++;
            }
            u(cVar, z0Var, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList3.add(Short.valueOf(sArr[i]));
                i++;
            }
            u(cVar, z0Var, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList4.add(Character.valueOf(cArr[i]));
                i++;
            }
            u(cVar, z0Var, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                arrayList5.add(Integer.valueOf(iArr[i]));
                i++;
            }
            u(cVar, z0Var, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                arrayList6.add(Long.valueOf(jArr[i]));
                i++;
            }
            u(cVar, z0Var, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                arrayList7.add(Float.valueOf(fArr[i]));
                i++;
            }
            u(cVar, z0Var, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                arrayList8.add(Double.valueOf(dArr[i]));
                i++;
            }
            u(cVar, z0Var, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            u(cVar, z0Var, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            v(cVar, z0Var, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = d.a;
            int length9 = atomicIntegerArray.length();
            ArrayList arrayList9 = new ArrayList(length9);
            while (i < length9) {
                arrayList9.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            u(cVar, z0Var, arrayList9);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            cVar.A(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            v(cVar, z0Var, d.b((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            cVar.z(obj.toString());
            return;
        }
        try {
            sug sugVar = (sug) this.c;
            if (sugVar == null) {
                sugVar = new sug(this.b, 24);
                this.c = sugVar;
            }
            t(cVar, z0Var, sugVar.s(z0Var, obj));
        } catch (Exception e3) {
            z0Var.d(q5.ERROR, "Failed serializing unknown object.", e3);
            cVar.z("[OBJECT]");
        }
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return new String((char[]) this.c, 0, this.b);
            case 21:
                cy6 cy6Var = (cy6) this.c;
                ArrayList arrayList = new ArrayList(cy6Var.b());
                for (int i = 0; i < cy6Var.b(); i++) {
                    arrayList.add(pqf.Q(cy6Var.a(i)));
                }
                return "UnsupportedBrands{major=" + pqf.Q(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public void u(c cVar, z0 z0Var, Collection collection) throws IOException {
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.b;
        cVar2.G();
        cVar2.b();
        int i = cVar2.c;
        int[] iArrCopyOf = cVar2.b;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            cVar2.b = iArrCopyOf;
        }
        int i2 = cVar2.c;
        cVar2.c = i2 + 1;
        iArrCopyOf[i2] = 1;
        cVar2.a.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            t(cVar, z0Var, it.next());
        }
        cVar2.h(1, 2, ']');
    }

    public void v(c cVar, z0 z0Var, Map map) throws IOException {
        cVar.j();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                cVar.q((String) obj);
                t(cVar, z0Var, map.get(obj));
            }
        }
        cVar.m();
    }

    public HashMap w(z0 z0Var, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, s(z0Var, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    z0Var.i(q5.INFO, ib8.j("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public void x(gr8 gr8Var, bv6 bv6Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object arrayList = linkedHashMap.get(gr8Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(gr8Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        wib wibVar = new wib(new WeakReference(bv6Var), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(wibVar);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                wib wibVar2 = (wib) arrayList2.get(i);
                if (j >= wibVar2.c) {
                    if (wibVar2.a.get() == bv6Var) {
                        arrayList2.set(i, wibVar);
                        break;
                    } else {
                        arrayList2.add(i, wibVar);
                        break;
                    }
                }
            }
        }
        g();
    }

    public void y(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        j(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String z(dch dchVar) {
        String str;
        fwg fwgVar = (fwg) this.c;
        int i = this.b;
        try {
            if (fwgVar.F == null) {
                throw null;
            }
            wrg wrgVar = fwgVar.F;
            String packageName = fwgVar.D.getPackageName();
            if (i == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i == 4) {
                str = "CONSUME_ASYNC";
            } else if (i != 5) {
                str = i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            mvg mvgVar = new mvg(dchVar);
            lrg lrgVar = (lrg) wrgVar;
            Parcel parcelM = lrgVar.M();
            parcelM.writeString(packageName);
            parcelM.writeString(str);
            int i2 = jrg.a;
            parcelM.writeStrongBinder(mvgVar);
            try {
                lrgVar.e.transact(1, parcelM, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelM.recycle();
            }
        } catch (Exception e) {
            fwgVar.G(z5h.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, swg.q);
            zsg.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            dchVar.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public /* synthetic */ sug(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public /* synthetic */ sug(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public sug(ConnectionResult connectionResult, int i) {
        this.a = 25;
        oa7.A(connectionResult);
        this.c = connectionResult;
        this.b = i;
    }

    public /* synthetic */ sug(int i, char c) {
        this.a = i;
    }

    public sug(ar0 ar0Var) {
        this.a = 1;
        this.c = ar0Var;
        this.b = 0;
    }

    public sug(int[] iArr, int i) {
        this.a = 21;
        this.b = i;
        cy6 cy6Var = cy6.a;
        if (iArr != null && iArr.length != 0) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            cy6Var = new cy6(iArrCopyOf, iArrCopyOf.length);
        }
        this.c = cy6Var;
    }

    public sug(fh1 fh1Var) {
        this.a = 18;
        this.c = fh1Var;
        this.b = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
    }

    public sug(int i) {
        this.a = 13;
        if (i > 0) {
            this.c = new Object[i];
        } else {
            qc0.j("The max pool size must be > 0");
            throw null;
        }
    }

    public sug(wr4 wr4Var) {
        this.a = 5;
        this.c = wr4Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sug(ld5 ld5Var, int i) {
        this(i, 16);
        this.a = 16;
        this.c = ld5Var;
    }

    public sug(int i, h71[] h71VarArr) {
        this.a = 22;
        this.b = i;
        this.c = h71VarArr;
    }

    public sug(boolean z, boolean z2, boolean z3) {
        this.a = 10;
        this.b = (z || z2 || z3) ? 1 : 0;
    }
}
