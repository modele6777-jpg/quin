package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tq0 implements x16 {
    public final /* synthetic */ int a;
    public static final tq0 b = new tq0(0);
    public static final tq0 c = new tq0(1);
    public static final tq0 d = new tq0(2);
    public static final tq0 e = new tq0(3);
    public static final tq0 f = new tq0(4);
    public static final tq0 g = new tq0(5);
    public static final tq0 v = new tq0(6);
    public static final tq0 w = new tq0(7);
    public static final tq0 x = new tq0(8);
    public static final tq0 y = new tq0(9);
    public static final tq0 z = new tq0(10);
    public static final tq0 X = new tq0(11);
    public static final tq0 Y = new tq0(12);
    public static final tq0 Z = new tq0(13);
    public static final tq0 E0 = new tq0(14);
    public static final tq0 F0 = new tq0(15);

    public /* synthetic */ tq0(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() throws IllegalAccessException {
        dz3 dz3Var;
        dz3 dz3Var2;
        int i = this.a;
        int i2 = 0;
        Class cls = Void.TYPE;
        switch (i) {
            case 0:
                return new y72(abg.c(1308617531));
            case 1:
                h51 h51Var = h51.a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(i51.class, i51.class.getClassLoader());
                serviceLoaderLoad.getClass();
                i51 i51Var = (i51) s72.w0(serviceLoaderLoad);
                if (i51Var != null) {
                    return i51Var;
                }
                qc0.p("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 2:
                return new y72(y72.b);
            case 3:
                return new y72(y72.b);
            case 4:
                np3 np3Var = new np3(new ge8("DefaultBuiltIns"));
                np3Var.c();
                return np3Var;
            case 5:
                wn7[] wn7VarArr = ky3.x;
                cls.getClass();
                return cls;
            case 6:
                m8c m8cVar = ez3.c;
                Field[] fields = ez3.class.getFields();
                fields.getClass();
                ArrayList<Field> arrayList = new ArrayList();
                int length = fields.length;
                while (i2 < length) {
                    Field field = fields[i2];
                    if (Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(field);
                    }
                    i2++;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Field field2 : arrayList) {
                    Object obj = field2.get(null);
                    ez3 ez3Var = obj instanceof ez3 ? (ez3) obj : null;
                    if (ez3Var != null) {
                        int i3 = ez3Var.b;
                        String name = field2.getName();
                        name.getClass();
                        dz3Var = new dz3(i3, name);
                    } else {
                        dz3Var = null;
                    }
                    if (dz3Var != null) {
                        arrayList2.add(dz3Var);
                    }
                }
                return arrayList2;
            case 7:
                m8c m8cVar2 = ez3.c;
                Field[] fields2 = ez3.class.getFields();
                fields2.getClass();
                ArrayList arrayList3 = new ArrayList();
                int length2 = fields2.length;
                while (i2 < length2) {
                    Field field3 = fields2[i2];
                    if (Modifier.isStatic(field3.getModifiers())) {
                        arrayList3.add(field3);
                    }
                    i2++;
                }
                ArrayList<Field> arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (pa7.t(((Field) obj2).getType(), Integer.TYPE)) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Field field4 : arrayList4) {
                    Object obj3 = field4.get(null);
                    obj3.getClass();
                    int iIntValue = ((Integer) obj3).intValue();
                    if (iIntValue == ((-iIntValue) & iIntValue)) {
                        String name2 = field4.getName();
                        name2.getClass();
                        dz3Var2 = new dz3(iIntValue, name2);
                    } else {
                        dz3Var2 = null;
                    }
                    if (dz3Var2 != null) {
                        arrayList5.add(dz3Var2);
                    }
                }
                return arrayList5;
            case 8:
                Set set = h04.b;
                return pu4.a;
            case 9:
                hy4 hy4Var = hy4.a;
                return (np3) np3.f.getValue();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                wn7[] wn7VarArr2 = ie7.g;
                return bm8.G(new iy9(sd7.a, new t4e("Deprecated in Java")));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                vu8 vu8Var = vu8.a;
                ServiceLoader serviceLoaderLoad2 = ServiceLoader.load(wu8.class, wu8.class.getClassLoader());
                serviceLoaderLoad2.getClass();
                List listJ1 = s72.j1(serviceLoaderLoad2);
                if (!listJ1.isEmpty()) {
                    return listJ1;
                }
                qc0.p("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return "There is more input to consume";
            case 14:
                return new y72(y72.b);
            case 15:
                yn7 yn7Var = qyd.a;
                cls.getClass();
                return cls;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ((nfc) lr7.j().c.e).g(job.a.b(je0.class), null, null);
            case 17:
                return ((nfc) lr7.j().c.e).g(job.a.b(rw8.class), null, null);
            case 18:
                return wef.a;
            case 19:
                throw null;
            case 20:
                return ((nfc) lr7.j().c.e).g(job.a.b(nb4.class), null, null);
            case 21:
                return ((nfc) lr7.j().c.e).g(job.a.b(yt6.class), null, null);
            case 22:
                return ((nfc) lr7.j().c.e).g(job.a.b(s7.class), null, null);
            case 23:
                return ((nfc) lr7.j().c.e).g(job.a.b(m62.class), null, null);
            case 24:
                return ((nfc) lr7.j().c.e).g(job.a.b(aw2.class), null, null);
            case 25:
                return ((nfc) lr7.j().c.e).g(job.a.b(nb4.class), null, null);
            case 26:
                return ((nfc) lr7.j().c.e).g(job.a.b(yt6.class), null, null);
            case 27:
                return ((nfc) lr7.j().c.e).g(job.a.b(s7.class), null, null);
            case 28:
                return ((nfc) lr7.j().c.e).g(job.a.b(m62.class), null, null);
            default:
                return ((nfc) lr7.j().c.e).g(job.a.b(ht6.class), null, null);
        }
    }

    public /* synthetic */ tq0(int i, Object obj) {
        this.a = i;
    }
}
