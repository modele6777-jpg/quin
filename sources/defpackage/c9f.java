package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.adjust.sdk.Constants;
import io.sentry.android.core.b1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class c9f extends d8c {
    public static Class h = null;
    public static Constructor i = null;
    public static Method j = null;
    public static Method k = null;
    public static boolean l = false;
    public final Class a;
    public final Constructor b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Method g;

    public c9f() throws NoSuchMethodException {
        Method methodF;
        Constructor<?> constructor;
        Method methodE;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodE = E(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodF = F(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            b1.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodF = null;
            constructor = null;
            methodE = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = methodE;
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = methodF;
    }

    public static boolean A(Object obj, String str, int i2, boolean z) throws NoSuchMethodException {
        D();
        try {
            return ((Boolean) j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            yg5.p(e);
            return false;
        }
    }

    public static void D() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (l) {
            return;
        }
        l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            b1.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    public static Method E(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Typeface B(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.g.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean C(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method F(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.d8c
    public final Typeface m(Context context, qq5 qq5Var, Resources resources, int i2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        rq5[] rq5VarArr = qq5Var.a;
        Method method = this.c;
        if (method == null) {
            b1.l("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i3 = 0;
        if (method == null) {
            D();
            try {
                Object objNewInstance2 = i.newInstance(null);
                for (rq5 rq5Var : rq5VarArr) {
                    File fileO = o8c.o(context);
                    if (fileO != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(rq5Var.f);
                                try {
                                    boolean zJ = o8c.j(inputStreamOpenRawResource, fileO);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zJ) {
                                        fileO.delete();
                                        return null;
                                    }
                                    if (!A(objNewInstance2, fileO.getPath(), rq5Var.b, rq5Var.c)) {
                                        fileO.delete();
                                        return null;
                                    }
                                    fileO.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileO.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileO.delete();
                            throw th4;
                        }
                    }
                }
                D();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) h, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) k.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    yg5.p(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                yg5.p(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = rq5VarArr.length;
            while (i3 < length) {
                rq5 rq5Var2 = rq5VarArr[i3];
                c9f c9fVar = this;
                Context context2 = context;
                if (c9fVar.z(context2, objNewInstance, rq5Var2.a, rq5Var2.e, rq5Var2.b, rq5Var2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(rq5Var2.d))) {
                    i3++;
                    this = c9fVar;
                    context = context2;
                } else {
                    try {
                        c9fVar.f.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                    }
                }
            }
            c9f c9fVar2 = this;
            if (c9fVar2.C(objNewInstance)) {
                return c9fVar2.B(objNewInstance);
            }
        }
        return null;
    }

    @Override // defpackage.d8c
    public final Typeface n(Context context, er5[] er5VarArr, int i2) throws IOException {
        Object objNewInstance;
        Typeface typefaceB;
        boolean zBooleanValue;
        if (er5VarArr.length >= 1) {
            Method method = this.c;
            if (method == null) {
                b1.l("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (er5 er5Var : er5VarArr) {
                        if (er5Var.f == 0) {
                            Uri uri = er5Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, o8c.p(uri, context));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.b.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = er5VarArr.length;
                        int i3 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f;
                            if (i3 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!C(objNewInstance) || (typefaceB = B(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceB, i2);
                            }
                            er5 er5Var2 = er5VarArr[i3];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(er5Var2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.d.invoke(objNewInstance, byteBuffer, Integer.valueOf(er5Var2.b), null, Integer.valueOf(er5Var2.c), Integer.valueOf(er5Var2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i3++;
                            z = z;
                        }
                    }
                } else {
                    int i4 = (i2 & 1) == 0 ? Constants.MINIMAL_ERROR_STATUS_CODE : 700;
                    boolean z2 = (i2 & 2) != 0;
                    int i5 = Integer.MAX_VALUE;
                    er5 er5Var3 = null;
                    for (er5 er5Var4 : er5VarArr) {
                        int iAbs = (Math.abs(er5Var4.c - i4) * 2) + (er5Var4.d == z2 ? 0 : 1);
                        if (er5Var3 == null || i5 > iAbs) {
                            er5Var3 = er5Var4;
                            i5 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(er5Var3.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(er5Var3.c).setItalic(er5Var3.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.d8c
    public final Typeface p(Context context, Resources resources, int i2, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.c;
        if (method == null) {
            b1.l("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.b.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!z(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (C(objNewInstance)) {
                    return B(objNewInstance);
                }
            }
        } else {
            File fileO = o8c.o(context);
            try {
                if (fileO != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i2);
                        try {
                            boolean zJ = o8c.j(inputStreamOpenRawResource, fileO);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zJ) {
                                fileO.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileO.getPath());
                            fileO.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                return null;
            } finally {
                fileO.delete();
            }
        }
        return null;
    }

    public final boolean z(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
