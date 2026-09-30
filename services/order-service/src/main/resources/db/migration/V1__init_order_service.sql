CREATE TABLE orders (
    id UUID PRIMARY KEY,
    customer_name VARCHAR(120) NOT NULL,
    restaurant_id UUID NOT NULL,
    status VARCHAR(40) NOT NULL,
    total_amount_cents INTEGER NOT NULL,
    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ NOT NULL
);

CREATE TABLE order_status_history (
    id UUID PRIMARY KEY,
    order_id UUID NOT NULL REFERENCES orders(id),
    status VARCHAR(40) NOT NULL,
    source_event_id UUID,
    created_at TIMESTAMPTZ NOT NULL
);

CREATE TABLE processed_events (
    event_id UUID PRIMARY KEY,
    event_type VARCHAR(80) NOT NULL,
    processed_at TIMESTAMPTZ NOT NULL
);
