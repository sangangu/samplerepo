package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.CellPanel;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IndexedPanel;
import com.google.gwt.user.client.ui.InsertPanel;
import com.google.gwt.user.client.ui.InsertPanel.ForIsWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import javax.inject.Provider;
import org.jboss.errai.bus.client.framework.MessageBus;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.MessageBusProvider;
import org.jboss.errai.ioc.client.api.builtin.RequestDispatcherProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.api.builtin.SenderProvider;
import org.jboss.errai.ioc.client.container.CreationalCallback;
import org.jboss.errai.ioc.client.container.CreationalContext;
import org.jboss.errai.ioc.client.container.IOCBeanManager;
import org.jboss.errai.ioc.client.container.InitializationCallback;
import org.jfrog.client.local.HelloWorldClient;

public class BootstrapperImpl implements Bootstrapper {
  private final BootstrapperInjectionContext injContext = new BootstrapperInjectionContext();
  private final CreationalContext context = injContext.getRootContext();
  private final CreationalCallback<MessageBusProvider> inj1700_MessageBusProvider_creational = new CreationalCallback<MessageBusProvider>() {
    public MessageBusProvider getInstance(final CreationalContext context) {
      final MessageBusProvider inj1697_MessageBusProvider = new MessageBusProvider();
      context.addBean(context.getBeanReference(MessageBusProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1697_MessageBusProvider);
      return inj1697_MessageBusProvider;
    }
  };
  private final MessageBusProvider inj1697_MessageBusProvider = inj1700_MessageBusProvider_creational.getInstance(context);
  private final CreationalCallback<CallerProvider> inj1701_CallerProvider_creational = new CreationalCallback<CallerProvider>() {
    public CallerProvider getInstance(final CreationalContext context) {
      final CallerProvider inj1693_CallerProvider = new CallerProvider();
      context.addBean(context.getBeanReference(CallerProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1693_CallerProvider);
      return inj1693_CallerProvider;
    }
  };
  private final CallerProvider inj1693_CallerProvider = inj1701_CallerProvider_creational.getInstance(context);
  private final CreationalCallback<RequestDispatcherProvider> inj1702_RequestDispatcherProvider_creational = new CreationalCallback<RequestDispatcherProvider>() {
    public RequestDispatcherProvider getInstance(final CreationalContext context) {
      final RequestDispatcherProvider inj1687_RequestDispatcherProvider = new RequestDispatcherProvider();
      context.addBean(context.getBeanReference(RequestDispatcherProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1687_RequestDispatcherProvider);
      return inj1687_RequestDispatcherProvider;
    }
  };
  private final RequestDispatcherProvider inj1687_RequestDispatcherProvider = inj1702_RequestDispatcherProvider_creational.getInstance(context);
  private final CreationalCallback<SenderProvider> inj1703_SenderProvider_creational = new CreationalCallback<SenderProvider>() {
    public SenderProvider getInstance(final CreationalContext context) {
      final SenderProvider inj1695_SenderProvider = new SenderProvider();
      context.addBean(context.getBeanReference(SenderProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1695_SenderProvider);
      return inj1695_SenderProvider;
    }
  };
  private final SenderProvider inj1695_SenderProvider = inj1703_SenderProvider_creational.getInstance(context);
  private final CreationalCallback<IOCBeanManagerProvider> inj1704_IOCBeanManagerProvider_creational = new CreationalCallback<IOCBeanManagerProvider>() {
    public IOCBeanManagerProvider getInstance(final CreationalContext context) {
      final IOCBeanManagerProvider inj1685_IOCBeanManagerProvider = new IOCBeanManagerProvider();
      context.addBean(context.getBeanReference(IOCBeanManagerProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1685_IOCBeanManagerProvider);
      return inj1685_IOCBeanManagerProvider;
    }
  };
  private final IOCBeanManagerProvider inj1685_IOCBeanManagerProvider = inj1704_IOCBeanManagerProvider_creational.getInstance(context);
  private final CreationalCallback<InitBallotProvider> inj1705_InitBallotProvider_creational = new CreationalCallback<InitBallotProvider>() {
    public InitBallotProvider getInstance(final CreationalContext context) {
      final InitBallotProvider inj1689_InitBallotProvider = new InitBallotProvider();
      context.addBean(context.getBeanReference(InitBallotProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1689_InitBallotProvider);
      return inj1689_InitBallotProvider;
    }
  };
  private final InitBallotProvider inj1689_InitBallotProvider = inj1705_InitBallotProvider_creational.getInstance(context);
  private final CreationalCallback<DisposerProvider> inj1706_DisposerProvider_creational = new CreationalCallback<DisposerProvider>() {
    public DisposerProvider getInstance(final CreationalContext context) {
      final DisposerProvider inj1699_DisposerProvider = new DisposerProvider();
      context.addBean(context.getBeanReference(DisposerProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1699_DisposerProvider);
      _$1300398733__$121625827_beanManager(inj1699_DisposerProvider, inj1685_IOCBeanManagerProvider.get());
      return inj1699_DisposerProvider;
    }
  };
  private final DisposerProvider inj1699_DisposerProvider = inj1706_DisposerProvider_creational.getInstance(context);
  private final CreationalCallback<RootPanelProvider> inj1707_RootPanelProvider_creational = new CreationalCallback<RootPanelProvider>() {
    public RootPanelProvider getInstance(final CreationalContext context) {
      final RootPanelProvider inj1691_RootPanelProvider = new RootPanelProvider();
      context.addBean(context.getBeanReference(RootPanelProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1691_RootPanelProvider);
      return inj1691_RootPanelProvider;
    }
  };
  private final RootPanelProvider inj1691_RootPanelProvider = inj1707_RootPanelProvider_creational.getInstance(context);
  private InitializationCallback<HelloWorldClient> init_inj1708_HelloWorldClient = new InitializationCallback<HelloWorldClient>() {
    public void init(final HelloWorldClient obj) {
      obj.buildUI();
    }
  };
  private final CreationalCallback<HelloWorldClient> inj1709_HelloWorldClient_creational = new CreationalCallback<HelloWorldClient>() {
    public HelloWorldClient getInstance(final CreationalContext context) {
      final HelloWorldClient inj1708_HelloWorldClient = new HelloWorldClient();
      context.addBean(context.getBeanReference(HelloWorldClient.class, QualifierUtil.DEFAULT_QUALIFIERS), inj1708_HelloWorldClient);
      _$998869337__1999551324_bus(inj1708_HelloWorldClient, inj1697_MessageBusProvider.get());
      context.addInitializationCallback(inj1708_HelloWorldClient, init_inj1708_HelloWorldClient);
      return inj1708_HelloWorldClient;
    }
  };
  private final HelloWorldClient inj1708_HelloWorldClient = inj1709_HelloWorldClient_creational.getInstance(context);
  private void declareBeans_0() {
    injContext.addBean(MessageBusProvider.class, MessageBusProvider.class, inj1700_MessageBusProvider_creational, inj1697_MessageBusProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, MessageBusProvider.class, inj1700_MessageBusProvider_creational, inj1697_MessageBusProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(CallerProvider.class, CallerProvider.class, inj1701_CallerProvider_creational, inj1693_CallerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, CallerProvider.class, inj1701_CallerProvider_creational, inj1693_CallerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(RequestDispatcherProvider.class, RequestDispatcherProvider.class, inj1702_RequestDispatcherProvider_creational, inj1687_RequestDispatcherProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, RequestDispatcherProvider.class, inj1702_RequestDispatcherProvider_creational, inj1687_RequestDispatcherProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SenderProvider.class, SenderProvider.class, inj1703_SenderProvider_creational, inj1695_SenderProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, SenderProvider.class, inj1703_SenderProvider_creational, inj1695_SenderProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IOCBeanManagerProvider.class, IOCBeanManagerProvider.class, inj1704_IOCBeanManagerProvider_creational, inj1685_IOCBeanManagerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, IOCBeanManagerProvider.class, inj1704_IOCBeanManagerProvider_creational, inj1685_IOCBeanManagerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(InitBallotProvider.class, InitBallotProvider.class, inj1705_InitBallotProvider_creational, inj1689_InitBallotProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, InitBallotProvider.class, inj1705_InitBallotProvider_creational, inj1689_InitBallotProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(DisposerProvider.class, DisposerProvider.class, inj1706_DisposerProvider_creational, inj1699_DisposerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, DisposerProvider.class, inj1706_DisposerProvider_creational, inj1699_DisposerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(RootPanelProvider.class, RootPanelProvider.class, inj1707_RootPanelProvider_creational, inj1691_RootPanelProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, RootPanelProvider.class, inj1707_RootPanelProvider_creational, inj1691_RootPanelProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HelloWorldClient.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(VerticalPanel.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAlignment.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHorizontalAlignment.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVerticalAlignment.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(ForIsWidget.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(InsertPanel.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IndexedPanel.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(com.google.gwt.user.client.ui.IndexedPanel.ForIsWidget.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(CellPanel.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(ComplexPanel.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Panel.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(com.google.gwt.user.client.ui.HasWidgets.ForIsWidget.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasWidgets.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Iterable.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, HelloWorldClient.class, inj1709_HelloWorldClient_creational, inj1708_HelloWorldClient, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
  }

  private native static void _$998869337__1999551324_bus(HelloWorldClient instance, MessageBus value) /*-{
    instance.@org.jfrog.client.local.HelloWorldClient::bus = value;
  }-*/;

  private native static void _$1300398733__$121625827_beanManager(DisposerProvider instance, IOCBeanManager value) /*-{
    instance.@org.jboss.errai.ioc.client.api.builtin.DisposerProvider::beanManager = value;
  }-*/;

  // The main IOC bootstrap method.
  public BootstrapperInjectionContext bootstrapContainer() {
    declareBeans_0();
    return injContext;
  }
}