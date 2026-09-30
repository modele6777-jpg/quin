package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import io.sentry.android.core.b1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c9e extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public c9e(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        b9e b9eVar = new b9e(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    ho7.n("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                ho7.n("Unexpected end of document");
                return;
            }
            Menu menu2 = b9eVar.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hbb.p);
                        b9eVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        b9eVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        b9eVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        b9eVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        b9eVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        b9eVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, hbb.q);
                        b9eVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        b9eVar.j = (typedArrayObtainStyledAttributes2.getInt(5, b9eVar.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, b9eVar.d) & 65535);
                        b9eVar.k = typedArrayObtainStyledAttributes2.getText(7);
                        b9eVar.l = typedArrayObtainStyledAttributes2.getText(8);
                        b9eVar.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        b9eVar.n = string == null ? (char) 0 : string.charAt(0);
                        b9eVar.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        b9eVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                        b9eVar.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            b9eVar.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            b9eVar.r = b9eVar.e;
                        }
                        b9eVar.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        b9eVar.t = typedArrayObtainStyledAttributes2.getBoolean(4, b9eVar.f);
                        b9eVar.u = typedArrayObtainStyledAttributes2.getBoolean(1, b9eVar.g);
                        b9eVar.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        b9eVar.y = typedArrayObtainStyledAttributes2.getString(12);
                        b9eVar.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        b9eVar.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && b9eVar.w == 0 && b9eVar.x == null) {
                            b9eVar.z = (wr8) b9eVar.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                b1.l("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            b9eVar.z = null;
                        }
                        b9eVar.A = typedArrayObtainStyledAttributes2.getText(17);
                        b9eVar.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            b9eVar.D = do4.b(typedArrayObtainStyledAttributes2.getInt(19, -1), b9eVar.D);
                        } else {
                            b9eVar.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = bp.s(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            b9eVar.C = colorStateList;
                        } else {
                            b9eVar.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        b9eVar.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        b9eVar.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(b9eVar.b, b9eVar.i, b9eVar.j, b9eVar.k);
                        b9eVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        b9eVar.b = 0;
                        b9eVar.c = 0;
                        b9eVar.d = 0;
                        b9eVar.e = 0;
                        b9eVar.f = true;
                        b9eVar.g = true;
                    } else if (name3.equals("item")) {
                        if (!b9eVar.h) {
                            wr8 wr8Var = b9eVar.z;
                            if (wr8Var == null || !wr8Var.b.hasSubMenu()) {
                                b9eVar.h = true;
                                b9eVar.b(menu2.add(b9eVar.b, b9eVar.i, b9eVar.j, b9eVar.k));
                            } else {
                                b9eVar.h = true;
                                b9eVar.b(menu2.addSubMenu(b9eVar.b, b9eVar.i, b9eVar.j, b9eVar.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof qr8)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof qr8) {
                    qr8 qr8Var = (qr8) menu;
                    if (!qr8Var.p) {
                        qr8Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((qr8) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((qr8) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
