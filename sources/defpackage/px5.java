package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class px5 implements LayoutInflater.Factory2 {
    public final zx5 a;

    public px5(zx5 zx5Var) {
        this.a = zx5Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        fy5 fy5VarG;
        boolean zEquals = ox5.class.getName().equals(str);
        zx5 zx5Var = this.a;
        if (zEquals) {
            return new ox5(context, attributeSet, zx5Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbb.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = kx5.class.isAssignableFrom(tx5.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    kx5 kx5VarB = resourceId != -1 ? zx5Var.B(resourceId) : null;
                    if (kx5VarB == null && string != null) {
                        szc szcVar = zx5Var.c;
                        ArrayList arrayList = (ArrayList) szcVar.b;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                kx5 kx5Var = (kx5) arrayList.get(size);
                                if (kx5Var != null && string.equals(kx5Var.O0)) {
                                    kx5VarB = kx5Var;
                                    break;
                                }
                                size--;
                            } else {
                                Iterator it = ((HashMap) szcVar.c).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        kx5VarB = null;
                                        break;
                                    }
                                    fy5 fy5Var = (fy5) it.next();
                                    if (fy5Var != null) {
                                        kx5 kx5Var2 = fy5Var.c;
                                        if (string.equals(kx5Var2.O0)) {
                                            kx5VarB = kx5Var2;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (kx5VarB == null && id != -1) {
                        kx5VarB = zx5Var.B(id);
                    }
                    if (kx5VarB == null) {
                        tx5 tx5VarF = zx5Var.F();
                        context.getClassLoader();
                        kx5VarB = tx5VarF.a(attributeValue);
                        kx5VarB.Y = true;
                        kx5VarB.M0 = resourceId != 0 ? resourceId : id;
                        kx5VarB.N0 = id;
                        kx5VarB.O0 = string;
                        kx5VarB.Z = true;
                        kx5VarB.I0 = zx5Var;
                        mx5 mx5Var = zx5Var.w;
                        kx5VarB.J0 = mx5Var;
                        Context context2 = mx5Var.H0;
                        kx5VarB.T0 = true;
                        if ((mx5Var == null ? null : mx5Var.G0) != null) {
                            kx5VarB.T0 = true;
                        }
                        fy5VarG = zx5Var.a(kx5VarB);
                        if (zx5.I(2)) {
                            Log.v("FragmentManager", "Fragment " + kx5VarB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (kx5VarB.Z) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        kx5VarB.Z = true;
                        kx5VarB.I0 = zx5Var;
                        mx5 mx5Var2 = zx5Var.w;
                        kx5VarB.J0 = mx5Var2;
                        Context context3 = mx5Var2.H0;
                        kx5VarB.T0 = true;
                        if ((mx5Var2 == null ? null : mx5Var2.G0) != null) {
                            kx5VarB.T0 = true;
                        }
                        fy5VarG = zx5Var.g(kx5VarB);
                        if (zx5.I(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + kx5VarB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    hy5 hy5Var = iy5.a;
                    iy5.b(new jy5(kx5VarB, viewGroup));
                    iy5.a(kx5VarB).getClass();
                    kx5VarB.U0 = viewGroup;
                    fy5VarG.j();
                    fy5VarG.i();
                    qc0.p(ib8.j("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
