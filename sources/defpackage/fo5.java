package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fo5 {
    public static final fo5 b = new fo5();
    public static final fo5 c = new fo5();
    public static final fo5 d = new fo5();
    public final p89 a = new p89(0, new ho5[16]);

    public static void a(fo5 fo5Var) {
        fo5Var.getClass();
        if (fo5Var == b) {
            qc0.p("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (fo5Var == c) {
            qc0.p("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        p89 p89Var = fo5Var.a;
        int i = p89Var.c;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = p89Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (ho5) objArr[i2];
            if (!((i09) obj).a.Y) {
                i37.c("visitChildren called on an unattached node");
            }
            p89 p89Var2 = new p89(0, new i09[16]);
            i09 i09Var = ((i09) obj).a;
            i09 i09Var2 = i09Var.f;
            if (i09Var2 == null) {
                vd0.H(p89Var2, i09Var);
            } else {
                p89Var2.b(i09Var2);
            }
            while (true) {
                int i3 = p89Var2.c;
                if (i3 == 0) {
                    break;
                }
                i09 i09VarM0 = (i09) p89Var2.k(i3 - 1);
                if ((i09VarM0.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                    vd0.H(p89Var2, i09VarM0);
                } else {
                    while (i09VarM0 != null) {
                        if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            p89 p89Var3 = null;
                            while (i09VarM0 != null) {
                                if (i09VarM0 instanceof oo5) {
                                    if (((oo5) i09VarM0).s1(7)) {
                                        break;
                                    }
                                } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                    int i4 = 0;
                                    for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                        if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                i09VarM0 = i09Var3;
                                            } else {
                                                if (p89Var3 == null) {
                                                    p89Var3 = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM0 != null) {
                                                    p89Var3.b(i09VarM0);
                                                    i09VarM0 = null;
                                                }
                                                p89Var3.b(i09Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                i09VarM0 = vd0.m0(p89Var3);
                            }
                            break;
                        }
                        i09VarM0 = i09VarM0.f;
                    }
                }
            }
        }
    }
}
