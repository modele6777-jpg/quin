package io.sentry.config;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Process;
import android.text.Layout;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ap;
import defpackage.hkb;
import defpackage.ib8;
import defpackage.iy9;
import defpackage.j6;
import defpackage.lw7;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.ub3;
import defpackage.v4e;
import defpackage.yf9;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.i;
import io.sentry.android.replay.j0;
import io.sentry.android.replay.util.l;
import io.sentry.android.replay.viewhierarchy.g;
import io.sentry.l3;
import io.sentry.o1;
import io.sentry.protocol.d0;
import io.sentry.protocol.f;
import io.sentry.protocol.i0;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.util.j;
import io.sentry.util.n;
import io.sentry.util.q;
import io.sentry.v4;
import io.sentry.z0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Boolean a;
    public static io.sentry.internal.debugmeta.c b;

    public static String a(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10".concat(str), 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    public static FileInputStream b(File file, FileInputStream fileInputStream) {
        return q4.b().o().isTracingEnabled() ? new io.sentry.instrumentation.file.d(io.sentry.instrumentation.file.d.b(file, fileInputStream)) : fileInputStream;
    }

    public static FileInputStream c(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
        if (!q4.b().o().isTracingEnabled()) {
            return fileInputStream;
        }
        o1 o1VarP = j.a ? q4.b().p() : q4.b().b();
        return new io.sentry.instrumentation.file.d(new io.sentry.instrumentation.file.b(null, o1VarP != null ? o1VarP.r("file.read") : null, fileInputStream, q4.b().o()), fileDescriptor);
    }

    public static FileOutputStream d(File file, FileOutputStream fileOutputStream, boolean z) {
        return q4.b().o().isTracingEnabled() ? new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.b(file, fileOutputStream, z)) : fileOutputStream;
    }

    public static FileOutputStream e(FileOutputStream fileOutputStream, File file) {
        return q4.b().o().isTracingEnabled() ? new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.b(file, fileOutputStream, false)) : fileOutputStream;
    }

    public static boolean f(v4 v4Var, String str, l3 l3Var, z0 z0Var) {
        int i = 8;
        int i2 = 2;
        int i3 = 0;
        switch (str) {
            case "debug_meta":
                v4Var.Y = (f) l3Var.A0(z0Var, new io.sentry.clientreport.a(i));
                return true;
            case "server_name":
                v4Var.y = l3Var.O();
                return true;
            case "contexts":
                v4Var.b.m(io.sentry.clientreport.a.c(l3Var, z0Var));
                return true;
            case "environment":
                v4Var.g = l3Var.O();
                return true;
            case "breadcrumbs":
                v4Var.X = l3Var.N0(z0Var, new io.sentry.f(i3));
                return true;
            case "sdk":
                v4Var.c = (u) l3Var.A0(z0Var, new io.sentry.clientreport.a(21));
                return true;
            case "dist":
                v4Var.z = l3Var.O();
                return true;
            case "tags":
                v4Var.e = io.sentry.util.b.o((Map) l3Var.D0());
                return true;
            case "user":
                v4Var.w = (i0) l3Var.A0(z0Var, new d0(i2));
                return true;
            case "extra":
                v4Var.Z = io.sentry.util.b.o((Map) l3Var.D0());
                return true;
            case "event_id":
                v4Var.a = (w) l3Var.A0(z0Var, new io.sentry.clientreport.a(23));
                return true;
            case "release":
                v4Var.f = l3Var.O();
                return true;
            case "request":
                v4Var.d = (r) l3Var.A0(z0Var, new io.sentry.clientreport.a(19));
                return true;
            case "platform":
                v4Var.v = l3Var.O();
                return true;
            default:
                return false;
        }
    }

    public static BigDecimal g(double d) {
        return BigDecimal.valueOf(d).setScale(6, RoundingMode.DOWN);
    }

    public static io.sentry.internal.gestures.c h(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, io.sentry.internal.gestures.b bVar) {
        float f3;
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new i(view, f, f2));
        io.sentry.internal.gestures.c cVar = null;
        while (!arrayDeque.isEmpty()) {
            i iVar = (i) arrayDeque.poll();
            View view2 = iVar.a;
            float f4 = iVar.c;
            float f5 = iVar.b;
            int width = view2.getWidth();
            int height = view2.getHeight();
            if (f5 < 0.0f || f5 > width || f4 < 0.0f || f4 > height) {
                cVar = cVar;
            } else {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int scrollX = viewGroup.getScrollX();
                    int scrollY = viewGroup.getScrollY();
                    int i = 0;
                    while (i < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            float left = (scrollX + f5) - childAt.getLeft();
                            float top = (scrollY + f4) - childAt.getTop();
                            Matrix matrix = childAt.getMatrix();
                            if (matrix == null || matrix.isIdentity()) {
                                f3 = f5;
                            } else {
                                f3 = f5;
                                Matrix matrix2 = new Matrix();
                                if (matrix.invert(matrix2)) {
                                    float[] fArr = {left, top};
                                    matrix2.mapPoints(fArr);
                                    float f6 = fArr[0];
                                    top = fArr[1];
                                    left = f6;
                                }
                            }
                            arrayDeque.add(new i(childAt, left, top));
                        } else {
                            f3 = f5;
                        }
                        i++;
                        cVar = cVar;
                        f5 = f3;
                    }
                }
                cVar = cVar;
                for (int i2 = 0; i2 < gestureTargetLocators.size(); i2++) {
                    io.sentry.internal.gestures.c cVarA = gestureTargetLocators.get(i2).a(view2, f, f2, bVar);
                    if (cVarA != null) {
                        if (bVar == io.sentry.internal.gestures.b.CLICKABLE) {
                            cVar = cVarA;
                        } else if (bVar == io.sentry.internal.gestures.b.SCROLLABLE) {
                            return cVarA;
                        }
                    }
                }
            }
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[LOOP:0: B:30:0x0096->B:34:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[LOOP:1: B:36:0x00b0->B:40:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0175  */
    public static g i(View view, g gVar, j6 j6Var) {
        boolean z;
        Drawable drawable;
        Bitmap bitmap;
        int extendedPaddingTop;
        Object tag;
        String str;
        Class<?> superclass;
        CopyOnWriteArraySet copyOnWriteArraySet;
        Class<?> superclass2;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        String lowerCase;
        j6Var.getClass();
        iy9 iy9VarA = l.a(view);
        boolean zBooleanValue = ((Boolean) iy9VarA.a()).booleanValue();
        Rect rect = (Rect) iy9VarA.b();
        boolean z2 = true;
        if (zBooleanValue) {
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (v4e.F(lowerCase2, "sentry-unmask", false)) {
                    j6Var.x();
                    z = false;
                } else {
                    if (pa7.t(view.getTag(R.id.sentry_privacy), "unmask")) {
                        j6Var.x();
                    } else {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (v4e.F(lowerCase, "sentry-mask", false)) {
                                j6Var.x();
                            } else if (pa7.t(view.getTag(R.id.sentry_privacy), "mask")) {
                                j6Var.x();
                            } else {
                                if (view.getParent() != null) {
                                    view.getParent().getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) j6Var.b;
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) j6Var.a;
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z = true;
                        } else {
                            if (pa7.t(view.getTag(R.id.sentry_privacy), "mask")) {
                                j6Var.x();
                            } else {
                                if (view.getParent() != null) {
                                    view.getParent().getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) j6Var.b;
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) j6Var.a;
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                }
            } else {
                if (pa7.t(view.getTag(R.id.sentry_privacy), "unmask")) {
                    j6Var.x();
                } else {
                    tag = view.getTag();
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (v4e.F(lowerCase, "sentry-mask", false)) {
                            j6Var.x();
                        } else if (pa7.t(view.getTag(R.id.sentry_privacy), "mask")) {
                            j6Var.x();
                        } else {
                            if (view.getParent() != null) {
                                view.getParent().getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = (CopyOnWriteArraySet) j6Var.b;
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = (CopyOnWriteArraySet) j6Var.a;
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        z = true;
                    } else {
                        if (pa7.t(view.getTag(R.id.sentry_privacy), "mask")) {
                            j6Var.x();
                        } else {
                            if (view.getParent() != null) {
                                view.getParent().getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = (CopyOnWriteArraySet) j6Var.b;
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = (CopyOnWriteArraySet) j6Var.a;
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            z = false;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.d dVar = layout != null ? new io.sentry.d(5, layout) : null;
            int currentTextColor = textView.getCurrentTextColor() | (-16777216);
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            try {
                extendedPaddingTop = textView.getTotalPaddingTop();
            } catch (NullPointerException unused) {
                extendedPaddingTop = textView.getExtendedPaddingTop();
            }
            textView.getX();
            textView.getY();
            return new io.sentry.android.replay.viewhierarchy.f(dVar, Integer.valueOf(currentTextColor), totalPaddingLeft, extendedPaddingTop, textView.getWidth(), textView.getHeight(), textView.getElevation() + (gVar != null ? gVar.c : 0.0f), gVar, z, zBooleanValue, rect);
        }
        if (!(view instanceof ImageView)) {
            if (!(view instanceof SurfaceView)) {
                view.getX();
                view.getY();
                return new io.sentry.android.replay.viewhierarchy.c(view.getWidth(), view.getHeight(), view.getElevation() + (gVar != null ? gVar.c : 0.0f), gVar, z, zBooleanValue, rect);
            }
            WeakReference weakReference = new WeakReference(view);
            SurfaceView surfaceView = (SurfaceView) view;
            surfaceView.getX();
            surfaceView.getY();
            return new io.sentry.android.replay.viewhierarchy.e(weakReference, surfaceView.getWidth(), surfaceView.getHeight(), surfaceView.getElevation() + (gVar != null ? gVar.c : 0.0f), gVar, z, zBooleanValue, rect);
        }
        ImageView imageView = (ImageView) view;
        imageView.getX();
        imageView.getY();
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        float elevation = imageView.getElevation() + (gVar != null ? gVar.c : 0.0f);
        if (!z || (drawable = imageView.getDrawable()) == null) {
            z2 = false;
        } else {
            if ((drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) || ((drawable instanceof BitmapDrawable) && ((bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled() || bitmap.getHeight() <= 10 || bitmap.getWidth() <= 10))) {
                z2 = false;
            }
        }
        return new io.sentry.android.replay.viewhierarchy.d(width, height, elevation, gVar, z2, zBooleanValue, rect);
    }

    public static String j() {
        byte[] bArr = new byte[16];
        n.a().b(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return q.b(new UUID(j2, j));
    }

    public static String k(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : obj.getClass().getSimpleName();
    }

    public static Date l(String str) {
        try {
            return new Date(io.sentry.vendor.a.i(str));
        } catch (IllegalArgumentException unused) {
            qc0.j(ub3.i("timestamp is not ISO format ", str));
            return null;
        }
    }

    public static Date m(String str) {
        try {
            return new Date(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            qc0.j(ub3.i("timestamp is not millis format ", str));
            return null;
        }
    }

    public static io.sentry.internal.debugmeta.c n() {
        Method declaredMethod;
        io.sentry.internal.debugmeta.c cVar = b;
        if (cVar != null) {
            return cVar;
        }
        Method method = null;
        try {
            declaredMethod = LayoutNode.class.getDeclaredMethod("getChildren$ui_release", null);
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        try {
            Method declaredMethod2 = LayoutNode.class.getDeclaredMethod("getOuterCoordinator$ui_release", null);
            declaredMethod2.setAccessible(true);
            method = declaredMethod2;
        } catch (NoSuchMethodException unused2) {
        }
        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(declaredMethod, method, false, 9);
        b = cVar2;
        return cVar2;
    }

    public static final Window o(View view) throws IllegalAccessException {
        Field field;
        view.getClass();
        lw7 lw7Var = j0.a;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) j0.a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) j0.b.getValue()) == null) {
            return null;
        }
        Object obj = field.get(rootView);
        obj.getClass();
        return (Window) obj;
    }

    public static String p(View view) {
        int id = view.getId();
        if (id != -1 && (((-16777216) & id) != 0 || (16777215 & id) == 0)) {
            Resources resources = view.getContext().getResources();
            if (resources == null) {
                return "";
            }
            try {
                return resources.getResourceEntryName(id);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean r(Context context) {
        io.sentry.util.b.r(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean t(LayoutNode layoutNode) throws IllegalAccessException, InvocationTargetException {
        Boolean bool = a;
        Boolean bool2 = Boolean.FALSE;
        if (pa7.t(bool, bool2)) {
            return layoutNode.getOuterCoordinator$ui().q1();
        }
        if (pa7.t(bool, Boolean.TRUE)) {
            Method method = (Method) n().c;
            method.getClass();
            Object objInvoke = method.invoke(layoutNode, null);
            objInvoke.getClass();
            return ((yf9) objInvoke).q1();
        }
        if (bool != null) {
            ap.c();
            return false;
        }
        try {
            boolean zQ1 = layoutNode.getOuterCoordinator$ui().q1();
            a = bool2;
            return zQ1;
        } catch (NoSuchMethodError unused) {
            a = Boolean.TRUE;
            Method method2 = (Method) n().c;
            method2.getClass();
            Object objInvoke2 = method2.invoke(layoutNode, null);
            objInvoke2.getClass();
            return ((yf9) objInvoke2).q1();
        }
    }

    public static Field u(z0 z0Var, String str) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField("tag");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            z0Var.i(q5.WARNING, ib8.j("Could not load ", str, ".tag field"), new Object[0]);
            return null;
        }
    }

    public static byte[] v(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
            while (true) {
                int i = inputStream.read(bArr, 0, UserMetadata.MAX_ATTRIBUTE_SIZE);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void w(v4 v4Var, io.sentry.internal.debugmeta.c cVar, z0 z0Var) throws IOException {
        if (v4Var.a != null) {
            cVar.q("event_id");
            cVar.w(z0Var, v4Var.a);
        }
        cVar.q("contexts");
        cVar.w(z0Var, v4Var.b);
        if (v4Var.c != null) {
            cVar.q("sdk");
            cVar.w(z0Var, v4Var.c);
        }
        if (v4Var.d != null) {
            cVar.q("request");
            cVar.w(z0Var, v4Var.d);
        }
        AbstractMap abstractMap = v4Var.e;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            cVar.q("tags");
            cVar.w(z0Var, v4Var.e);
        }
        if (v4Var.f != null) {
            cVar.q(BuildConfig.BUILD_TYPE);
            cVar.z(v4Var.f);
        }
        if (v4Var.g != null) {
            cVar.q("environment");
            cVar.z(v4Var.g);
        }
        if (v4Var.v != null) {
            cVar.q("platform");
            cVar.z(v4Var.v);
        }
        if (v4Var.w != null) {
            cVar.q("user");
            cVar.w(z0Var, v4Var.w);
        }
        if (v4Var.y != null) {
            cVar.q("server_name");
            cVar.z(v4Var.y);
        }
        if (v4Var.z != null) {
            cVar.q("dist");
            cVar.z(v4Var.z);
        }
        List list = v4Var.X;
        if (list != null && !list.isEmpty()) {
            cVar.q("breadcrumbs");
            cVar.w(z0Var, v4Var.X);
        }
        if (v4Var.Y != null) {
            cVar.q("debug_meta");
            cVar.w(z0Var, v4Var.Y);
        }
        AbstractMap abstractMap2 = v4Var.Z;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        cVar.q("extra");
        cVar.w(z0Var, v4Var.Z);
    }

    public static final Rect x(hkb hkbVar) {
        return new Rect((int) Math.floor(hkbVar.a), (int) Math.floor(hkbVar.b), (int) Math.ceil(hkbVar.c), (int) Math.ceil(hkbVar.d));
    }

    public abstract int q();

    public abstract boolean s();
}
