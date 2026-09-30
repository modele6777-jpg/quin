package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tk9 extends ffg implements vt6 {
    public final Object e;

    public tk9(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 5);
        this.e = obj;
    }

    public static vt6 M(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof vt6 ? (vt6) iInterfaceQueryLocalInterface : new trg(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }

    public static Object N(vt6 vt6Var) {
        if (vt6Var instanceof tk9) {
            return ((tk9) vt6Var).e;
        }
        IBinder iBinderAsBinder = vt6Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            qc0.j(ub3.h(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        oa7.A(field);
        if (field.isAccessible()) {
            qc0.j("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
