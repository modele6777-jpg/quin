package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r00 implements sa1 {
    public final Class a;
    public final ArrayList b;
    public final p00 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public r00(Class cls, ArrayList arrayList, p00 p00Var, q00 q00Var, List list) {
        cls.getClass();
        list.getClass();
        this.a = cls;
        this.b = arrayList;
        this.c = p00Var;
        this.d = list;
        ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list2 = this.d;
        ArrayList arrayList3 = new ArrayList(t72.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> cls2 = (Class) smb.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list3 = this.d;
        ArrayList arrayList4 = new ArrayList(t72.u(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == p00.b && q00Var == q00.a && !s72.M0("value", this.b).isEmpty()) {
            s8f.i("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // defpackage.sa1
    public final List a() {
        return this.e;
    }

    @Override // defpackage.sa1
    public final Member b() {
        return null;
    }

    @Override // defpackage.sa1
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d A[LOOP:0: B:5:0x001a->B:52:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    @Override // defpackage.sa1
    public final Object call(Object[] objArr) {
        Object obj;
        Class cls;
        em7 em7VarB;
        kob kobVar;
        String strG;
        objArr.getClass();
        int length = objArr.length;
        ArrayList arrayList = this.e;
        if (arrayList.size() != length) {
            qc0.f(arrayList.size(), length);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(objArr.length);
        int length2 = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.b;
            if (i >= length2) {
                return an1.r(this.a, bm8.W(s72.r1(arrayList3, arrayList2)), this.d);
            }
            Object array = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList4 = this.f;
            if (array == null && this.c == p00.a) {
                array = this.g.get(i2);
            } else {
                Class cls2 = (Class) arrayList4.get(i2);
                if (!(array instanceof Class)) {
                    if (array instanceof em7) {
                        array = af1.R((em7) array);
                    } else {
                        if (array instanceof Object[]) {
                            Object[] objArr2 = (Object[]) array;
                            if (!(objArr2 instanceof Class[])) {
                                if (objArr2 instanceof em7[]) {
                                    em7[] em7VarArr = (em7[]) array;
                                    ArrayList arrayList5 = new ArrayList(em7VarArr.length);
                                    for (em7 em7Var : em7VarArr) {
                                        arrayList5.add(af1.R(em7Var));
                                    }
                                    obj = null;
                                    array = arrayList5.toArray(new Class[0]);
                                } else {
                                    obj = null;
                                    array = objArr2;
                                }
                            }
                        }
                        if (!cls2.isInstance(array)) {
                            array = obj;
                        }
                        if (array == null) {
                            String str = (String) arrayList3.get(i2);
                            cls = (Class) arrayList4.get(i2);
                            if (pa7.t(cls, Class.class)) {
                                kobVar = job.a;
                                em7VarB = kobVar.b(em7.class);
                            } else if (cls.isArray() || !pa7.t(cls.getComponentType(), Class.class)) {
                                kob kobVar2 = job.a;
                                em7VarB = kobVar2.b(cls);
                                kobVar = kobVar2;
                            } else {
                                kobVar = job.a;
                                em7VarB = kobVar.b(em7[].class);
                            }
                            if (pa7.t(em7VarB.g(), kobVar.b(Object[].class).g())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(em7VarB.g());
                                sb.append('<');
                                Class<?> componentType = af1.R(em7VarB).getComponentType();
                                componentType.getClass();
                                sb.append(kobVar.b(componentType).g());
                                sb.append('>');
                                strG = sb.toString();
                            } else {
                                strG = em7VarB.g();
                            }
                            throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strG);
                        }
                        arrayList2.add(array);
                        i++;
                        i2 = i3;
                    }
                    obj = null;
                    if (!cls2.isInstance(array)) {
                        array = obj;
                    }
                    if (array == null) {
                        String str2 = (String) arrayList3.get(i2);
                        cls = (Class) arrayList4.get(i2);
                        if (pa7.t(cls, Class.class)) {
                            kobVar = job.a;
                            em7VarB = kobVar.b(em7.class);
                        } else if (cls.isArray()) {
                            kob kobVar3 = job.a;
                            em7VarB = kobVar3.b(cls);
                            kobVar = kobVar3;
                        } else {
                            kob kobVar4 = job.a;
                            em7VarB = kobVar4.b(cls);
                            kobVar = kobVar4;
                        }
                        if (pa7.t(em7VarB.g(), kobVar.b(Object[].class).g())) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(em7VarB.g());
                            sb2.append('<');
                            Class<?> componentType2 = af1.R(em7VarB).getComponentType();
                            componentType2.getClass();
                            sb2.append(kobVar.b(componentType2).g());
                            sb2.append('>');
                            strG = sb2.toString();
                        } else {
                            strG = em7VarB.g();
                        }
                        throw new IllegalArgumentException("Argument #" + i2 + ' ' + str2 + " is not of the required type " + strG);
                    }
                    arrayList2.add(array);
                    i++;
                    i2 = i3;
                }
                array = null;
            }
            if (array == null) {
                String str3 = (String) arrayList3.get(i2);
                cls = (Class) arrayList4.get(i2);
                if (pa7.t(cls, Class.class)) {
                    kobVar = job.a;
                    em7VarB = kobVar.b(em7.class);
                } else if (cls.isArray()) {
                    kob kobVar5 = job.a;
                    em7VarB = kobVar5.b(cls);
                    kobVar = kobVar5;
                } else {
                    kob kobVar6 = job.a;
                    em7VarB = kobVar6.b(cls);
                    kobVar = kobVar6;
                }
                if (pa7.t(em7VarB.g(), kobVar.b(Object[].class).g())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(em7VarB.g());
                    sb3.append('<');
                    Class<?> componentType3 = af1.R(em7VarB).getComponentType();
                    componentType3.getClass();
                    sb3.append(kobVar.b(componentType3).g());
                    sb3.append('>');
                    strG = sb3.toString();
                } else {
                    strG = em7VarB.g();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str3 + " is not of the required type " + strG);
            }
            arrayList2.add(array);
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.sa1
    public final Type getReturnType() {
        return this.a;
    }

    public /* synthetic */ r00(Class cls, ArrayList arrayList, p00 p00Var) {
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, p00Var, q00.b, arrayList2);
    }
}
